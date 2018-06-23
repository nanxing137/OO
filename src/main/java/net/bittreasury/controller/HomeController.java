package net.bittreasury.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.imageio.spi.RegisterableService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.bittreasury.config.WebSecurityConfig;
import net.bittreasury.entity.Match;
import net.bittreasury.entity.Team;
import net.bittreasury.entity.User;
import net.bittreasury.service.TeamService;
import net.bittreasury.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private TeamService teamservice;
	
	@RequestMapping("/")
	public String home() {
		return "home/home";
	}
	@Autowired
	private TeamService teamService;
	
	@RequestMapping("/register")
	public String register(ModelMap map)
	{
		
		List allTeam = teamservice.getAllTeam();
		map.addAttribute("teams",allTeam);
		return "user/userAdd";
	}
	
	
	@RequestMapping("/userAdd")
	public String userAdd(@RequestParam(name="team")Integer teamId,String uname,String upassword) {
		User user =new User();
		Team team = teamService.geTeamById(teamId);

		String isfootballer ="1";
		user.setTeam(team);
		user.setUname(uname);
		user.setUpassword(upassword);
		user.setIsfootballer(isfootballer);
		User b = userService.addUser(user);
		return "success/success";
	}
	@RequestMapping("/userAdd2")
	public String userAdd2(String uname,String upassword) {
		User user =new User();
		String isfootballer ="0";
		user.setUname(uname);
		user.setUpassword(upassword);
		user.setIsfootballer(isfootballer);
		User b = userService.addUser(user);
		return "success/success";
	}
	
	
	@RequestMapping("/login")
	public String login(@RequestParam(name="userName",defaultValue="") String username,@RequestParam(name="password",defaultValue="") String password,HttpSession session) {
		
		System.out.println(username);
		System.out.println(password);
		User user = userService.getUserByLogin2(username, password);
		//System.out.println(user);
		
		
		if (user!=null&&(null!=user.getUname())) {
			session.setAttribute(WebSecurityConfig.SESSION_KEY, username);
			session.setAttribute(WebSecurityConfig.SESSION_USER_ID, user.getUid());
			if("3".equals(user.getIsfootballer())){
				return "home/manager";
			
			}else{
				return "home/home";
			}
		}
		else {
			return "user/login";
		}
		
	}
	@RequestMapping("/logout")
	public String LogOut(HttpSession session) {
		session.removeAttribute(WebSecurityConfig.SESSION_KEY);
		session.removeAttribute(WebSecurityConfig.SESSION_USER_ID);
		return "home/home";
	}
	
	@RequestMapping("/seeplayer")
	public String seeplayer(ModelMap map)
	{
		
		List allTeam = teamservice.getAllTeam();
		map.addAttribute("teams",allTeam);
		return "user/footballerDetails";
	}

	
	@RequestMapping("/userregister")
	public String userregister(ModelMap map)
	{
		
		return "user/footballerfine";
	}
	
	
}
