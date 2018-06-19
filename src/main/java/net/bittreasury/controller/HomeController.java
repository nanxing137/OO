package net.bittreasury.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.bittreasury.config.WebSecurityConfig;
import net.bittreasury.entity.User;
import net.bittreasury.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String home() {
		return "home/home";
	}
	@RequestMapping("/login")
	public String login(@RequestParam(name="userName",defaultValue="") String username,@RequestParam(name="password",defaultValue="") String password,HttpSession session) {
		
		System.out.println(username);
		System.out.println(password);
		User user = userService.getUserByLogin2(username, password);
		
		
		if (user!=null&&(null!=user.getUname())) {
			session.setAttribute(WebSecurityConfig.SESSION_KEY, username);
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
		return "home/home";
	}

}
