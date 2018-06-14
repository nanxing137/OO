package net.bittreasury.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.bittreasury.entity.Team;
import net.bittreasury.entity.User;
import net.bittreasury.repository.TeamRepository;
import net.bittreasury.repository.UserRepository;
import net.bittreasury.service.TeamService;
import net.bittreasury.service.impl.TeamServiceImpl;

@Controller
public class TeamController {
	@Autowired
	private TeamService teamService;
	
	
	@GetMapping(name="/searchTeam")
	public String searchTeam(@RequestParam(name="teamName",defaultValue="") String teamName,ModelMap map) {
		List<Team> teams = teamService.findTeamList(teamName);
		map.addAttribute("teams",teams);
		System.out.println(teams.size());
		return "team/teamList";
	}
	
	
	@GetMapping("/getTeamById")
	public String geTeamById(@RequestParam(name="id",defaultValue="1") Integer id,ModelMap map) {
		Team team = teamService.geTeamById(id);
		map.addAttribute("team",team);
		return "team/teamDetails";
	}
}
