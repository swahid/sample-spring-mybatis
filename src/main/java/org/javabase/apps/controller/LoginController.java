package org.javabase.apps.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.javabase.apps.entity.User;
import org.javabase.apps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }
	
	@ResponseBody
	@RequestMapping(value="/registration", method = RequestMethod.POST)
	public Map<String, Object> registration(@RequestBody User user) {
		Map<String, Object> response= new HashMap<String, Object>();
        
		user.setRoleid(2);
		user.setRegdate(new Date());
		user.setIsactive("Y");
		user.setIsnonexpired("Y");
		user.setIsnonlocked("Y");
		user.setRegdate(new Date());
		userservice.addUser(user);
		response.put("suceess", true);
        response.put("message", "Registration Sucess");
		return response;
	}

	@RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login";
    }

}
