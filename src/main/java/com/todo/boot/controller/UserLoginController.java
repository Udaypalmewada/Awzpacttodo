package com.todo.boot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.todo.boot.entity.UserLoginModel;
import com.todo.boot.service.IUserloginService;

@Controller
public class UserLoginController {
	@Autowired 
	private IUserloginService loginservice;
	
	/**
	 * loginChek  whether user are existing or not.
	 * @param login  
	 * @param model
	 * @param sesion
	 * @return dashbaord.
	 */
	@RequestMapping(path = "/loginChek", method = RequestMethod.POST)
	public ModelAndView chekLogin(@ModelAttribute("login") UserLoginModel login, Model model, HttpSession sesion) {
		boolean flag = loginservice.checkUserExistance(login);
			if (flag) {
				
				model.addAttribute("msg", "Welcome to Awzpact");
				return new ModelAndView("dashboard");
			} else {
				model.addAttribute("msg", "Invalid UserName and Password");
				return new ModelAndView("login");
			}
		}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}
	}

