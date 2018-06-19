package net.bittreasury.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.bittreasury.entity.Match;
import net.bittreasury.entity.Team;
import net.bittreasury.service.TeamService;

@Controller
public class TeamController {
	@Autowired
	private TeamService teamService;
	
	
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
}
