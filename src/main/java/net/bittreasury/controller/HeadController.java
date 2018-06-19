package net.bittreasury.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import net.bittreasury.config.WebSecurityConfig;

@Controller
public class HeadController {
	
	
	@RequestMapping("head")
	public String head(ModelMap map,HttpSession session) {
		String userName = session.getAttribute(WebSecurityConfig.SESSION_KEY).toString();
		map.addAttribute(WebSecurityConfig.SESSION_KEY, userName);
		return "include/head";
	}
}
