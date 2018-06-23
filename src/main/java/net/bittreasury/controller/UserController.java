package net.bittreasury.controller;

import static org.springframework.test.web.client.response.MockRestResponseCreators.withUnauthorizedRequest;

import java.rmi.server.UID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.bittreasury.config.WebSecurityConfig;
import net.bittreasury.entity.User;
import net.bittreasury.service.TeamService;
import net.bittreasury.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping("/alterUser")
	public String alterUser(@RequestParam(name="user",defaultValue="") String user,ModelMap map) {
		
	return "user/alterUser";
	}
	@RequestMapping("/updataUser")
	public String updataUser(@RequestParam(name="userName",defaultValue="") String userName,ModelMap map,HttpSession session) {
		Integer uid=(Integer) session.getAttribute(WebSecurityConfig.SESSION_USER_ID);
		System.out.println(uid);
		User user1=userService.getUserById(uid);
		System.out.println(user1);
		user1.setUname(userName);
		userService.update(user1);
		map.addAttribute("user",user1);
	return "user/altersuccess";
	}
	@RequestMapping("/dropUser")
	public String dropUser(@RequestParam(name="userName",defaultValue="") String userName,ModelMap map,HttpSession session) {
		User user=userService.getUserByName(userName);
		System.out.println(user);
		userService.delete(user);
		Integer uid=(Integer) session.getAttribute(WebSecurityConfig.SESSION_USER_ID);
		System.out.println(uid);
		User user1=userService.getUserById(uid);
		map.addAttribute("user",user1);
	return "user/altersuccess";
	}
	@RequestMapping("/deleteUser")
	public String deleteUser(ModelMap map,HttpSession session) {
		Integer uid=(Integer) session.getAttribute(WebSecurityConfig.SESSION_USER_ID);
		User user1=userService.getUserById(uid);
		
		if(user1.getIsfootballer().equals("3"))
			return "user/dropuser";
		else 
			return "user/alterfalse";
	}
}
