package com.todo.boot.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.todo.boot.TodoApplication;
import com.todo.boot.entity.RegistrationModel;
import com.todo.boot.request.RegisterRequest;
import com.todo.boot.service.IUserService;

@Controller
public class RegistrationController {
	private static final Logger LOGGER=LoggerFactory.getLogger(TodoApplication.class);
	@Autowired
	private IUserService userService;
	
   /**
 * @param register model
 * @param model model
 * @param session session
 * return segistoredUser/orror.
 * @return
 */
@RequestMapping(path = "registorUser", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("register") RegisterRequest register, Model model,
			HttpSession session) {
		int id = userService.saveUser(register);
		if (id > 0) {
			model.addAttribute("msg", "Registration Successfull");
			session.setAttribute("name", register.getName());
			return new ModelAndView("redirect:/employeelist");
		} else {
			LOGGER.error("Registration failed{}", System.currentTimeMillis());
			model.addAttribute("msg", "User Not Registered...Please Try Again");
			model.addAttribute("register", new RegistrationModel());
			return new ModelAndView("redirect:/error");
		}
	}

}
