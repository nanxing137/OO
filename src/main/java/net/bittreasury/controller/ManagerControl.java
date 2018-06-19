package net.bittreasury.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.bittreasury.entity.Match;
import net.bittreasury.service.ManagerService;
import net.bittreasury.service.MatchService;
import net.bittreasury.service.TeamService;

@Controller
@RequestMapping("/manager")
public class ManagerControl {
	
	@Autowired
	private ManagerService managerControl;
	@Autowired
	private TeamService  teamService;
	@Autowired
	private MatchService matchservice;
	@RequestMapping("/madd")
	public String TeamList(ModelMap map) {
		List list=	teamService.queryTeamLsit();
		map.addAttribute("teams", list);
		return "match/madd";
	}
	@GetMapping("/madd1")
	public String matchadd(HttpServletRequest request) {
		int team_a=Integer.parseInt(request.getParameter("one1"));
		int team_b=Integer.parseInt(request.getParameter("two2"));
		int winner=Integer.parseInt(request.getParameter("three3"));
		String score=request.getParameter("score");
		String time = request.getParameter("time");
		String address = request.getParameter("address");
		;
		boolean b = matchservice.addMatch(teamService.geTeamById(team_a),teamService.geTeamById(team_b),teamService.geTeamById(winner),score,time,address);
		return "success/success";
	}
	@GetMapping("/mquery")
	public String queryMatch(ModelMap map) {
		
		 List<Match> list =  matchservice.queryMatchList();
		 System.out.println(list.size());
		 map.addAttribute("matchList", list);
		return "match/mquery";
	}
}
