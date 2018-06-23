package net.bittreasury.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.bittreasury.config.WebSecurityConfig;
import net.bittreasury.entity.Match;
import net.bittreasury.entity.Team;
import net.bittreasury.entity.User;
import net.bittreasury.service.TeamService;
import net.bittreasury.service.UserService;

@Controller
public class TeamController {
	@Autowired
	private TeamService teamService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/searchTeam")
	public String searchTeam(@RequestParam(name="teamName",defaultValue="") String teamName,ModelMap map) {
		List<Team> teams = teamService.findTeamList(teamName);
		map.addAttribute("teams",teams);
		System.out.println(teams.size());
		return "team/teamList";
	}
	
	
	@GetMapping("/getTeamById")
	public String geTeamById(@RequestParam(name="id",defaultValue="1") Integer id,ModelMap map) {
		Team team = teamService.geTeamById(id);
		Set<Match> matchs = new HashSet<>();
		matchs.addAll(team.getMatchsTeamA());
		matchs.addAll(team.getMatchsTeamB());
		matchs.addAll(team.getMatchsWinner());
		map.addAttribute("team",team);
		map.addAttribute("matchs", matchs);
		return "team/teamDetails";
	}
	@RequestMapping("/deleteTeam")
	public String deleteTeam(ModelMap map,HttpSession session) {
		Integer uid=(Integer) session.getAttribute(WebSecurityConfig.SESSION_USER_ID);
		User user1=userService.getUserById(uid);
		
		if(user1.getIsfootballer().equals("3"))
			return "team/dropteam";
		else 
			return "user/alterfalse";
	}
	@RequestMapping("/dropTeam")
	public String dropUser(@RequestParam(name="teamName",defaultValue="") String teamName,ModelMap map,HttpSession session) {
		System.out.println(teamName);
		Team team=teamService.getTeamByName(teamName);
		System.out.println(team);
		teamService.delete(team);
		Integer uid=(Integer) session.getAttribute(WebSecurityConfig.SESSION_USER_ID);
		System.out.println(uid);
		User user1=userService.getUserById(uid);
		map.addAttribute("user",user1);
		System.out.println(user1);
	return "user/altersuccess";
	}
}
