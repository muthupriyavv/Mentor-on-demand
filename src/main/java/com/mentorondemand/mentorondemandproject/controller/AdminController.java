package com.mentorondemand.mentorondemandproject.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.mentorondemand.mentorondemandproject.model.Admin;
import com.mentorondemand.mentorondemandproject.model.User;
import com.mentorondemand.mentorondemandproject.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	
	 @RequestMapping(path="/Admin", method = RequestMethod.GET)
	    public ModelAndView Admin(ModelMap map) throws SQLException {
	          ModelAndView mav = null;
	          map.addAttribute("adminlogin", new Admin());
	          mav = new ModelAndView("AdminLandingPage");
	          return mav;

	    } 
	 
	 @RequestMapping(path="/registerAdmin", method = RequestMethod.GET)
	    public ModelAndView AdminRegister(ModelMap map) throws SQLException {
	          ModelAndView mav = null;
	          map.addAttribute("adminregister", new Admin());
	          mav = new ModelAndView("AdminRegister");
	          return mav;

	    } 
	 
	 @RequestMapping(value = "/adminRegister", method = RequestMethod.POST)
	    public ModelAndView addAdmin( @ModelAttribute("adminregister") @Valid Admin admin, BindingResult result,
	                  HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
	           ModelAndView mav = null;
	           if (result.hasErrors()) {
	                  mav = new ModelAndView("AdminRegister");
	                  return mav;
	           }
	       System.out.println(admin);
	       adminservice.registerAdmin(admin);
	       mav = new ModelAndView("redirect:/Admin");
	       return mav;

	    }
	 
	 @RequestMapping(path= "/adminLogin", method = RequestMethod.POST)
	    public ModelAndView  AdminLogin( @ModelAttribute("adminlogin") @Valid Admin admin, BindingResult result,
	                  HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {

	     ModelAndView mav = null;
	     String email = admin.getEmail();
	     List<Admin> admin1 = adminservice.findByEmail(email);
	     Admin admin2 = admin1.get(0);
	     System.out.println(admin.getEmail()+" "+admin2.getEmail());
	     System.out.println(admin.getPassword()+" "+admin2.getPassword());
	     if (( admin.getEmail().equals(admin2.getEmail())) && (admin.getPassword().equals(admin2.getPassword())))
	     {
	                  
	    	 mav = new ModelAndView("AdminControlPage");
	            
	     } 
	     else 
	     {

	         mav = new ModelAndView("LoginError", "message", "Invalid Username or Password");
	     }
	  
	     return mav;


	    }
	 
	


}
