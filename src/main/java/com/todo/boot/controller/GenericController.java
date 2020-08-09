package com.todo.boot.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.todo.boot.entity.UserLoginModel;
import com.todo.boot.request.CityRequest;
import com.todo.boot.request.RegisterRequest;
import com.todo.boot.service.ICityService;
import com.todo.boot.service.IUserDataService;
import com.todo.boot.util.TodoConstant;
import com.todo.boot.util.TodoConstant.department;

/**
 * GenericController.
 * @author UDAY JAVA
 *GenericController for accepting all the request it
 *is working as frontcontroller
 */
@Controller
public class GenericController {
	private TodoConstant todoContant=null;
	@Autowired
	private ICityService cityService;
	@Autowired
    private IUserDataService userDataService;
	
	
	/**homepage.
	 * @return home page.
	 * for redirection to home page.
	 */
	@RequestMapping("/")
	public ModelAndView homePage() {
		ModelAndView vname = new ModelAndView();
		vname.setViewName("home");
		return vname;
	}
	
	/**
	 * login.
	 * @param model id ans password.
	 * @return login user.
	 */
	@RequestMapping("/userlogin")
  	public ModelAndView login(Model model) {
  	model.addAttribute("login",new UserLoginModel());
  	return new ModelAndView("userlogin");
  }
	/**
	 * after creating the container but
	 * before initialization do some changes.
	 */
	@PostConstruct
    public void init(){
    	  todoContant=new TodoConstant();
    	
    }
    /** Register
     * @param model
     * @return register user model.
     */
    @RequestMapping("/registor")
   	public ModelAndView registor(Model model) {
    model.addAttribute("register", new RegisterRequest());
    List<CityRequest> cityList = cityService.findAll();
    model.addAttribute("cityList", cityList);
    Map<department, Integer> departmentList=todoContant.listOfDepartMent();
    model.addAttribute("departmentList", departmentList);
   	return new ModelAndView("registor");
  	
   
  }
   	
	/**List Of emplyee.
	 * @param model
	 * @return list of emplyee.
	 */
	@RequestMapping("/employeelist")
  	public ModelAndView list(Model model) {
  	List<RegisterRequest> listEmp = userDataService.listOfAllEmployee();
  	//List<RegisterRequest> listEmp = userDataService.listOfAllUsers();
    model.addAttribute("listEmp", listEmp);
    System.out.println(listEmp.toString());
  	return new ModelAndView("employeelist");
   	
  }
}
