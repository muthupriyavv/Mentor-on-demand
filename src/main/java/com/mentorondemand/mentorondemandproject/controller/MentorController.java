package com.mentorondemand.mentorondemandproject.controller;

import java.sql.SQLException;
import java.util.ArrayList;
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

import com.mentorondemand.mentorondemandproject.model.Mentor;
import com.mentorondemand.mentorondemandproject.model.User;
import com.mentorondemand.mentorondemandproject.service.MentorService;


@Controller
public class MentorController {
	
	@Autowired
	private MentorService mentorservice;
	 
	 @RequestMapping(value = "/addMentor", method = RequestMethod.POST)
	    public ModelAndView registerMentor( @ModelAttribute("mentor") @Valid Mentor mentor, BindingResult result,
	                  HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
	           ModelAndView mav = null;
	           if (result.hasErrors()) {
	                  mav = new ModelAndView("signup");
	                  return mav;
	           }
	       System.out.println(mentor);
	       mentorservice.registerMentor(mentor);
	       mav = new ModelAndView("redirect:/Login");
	           return mav;
	 }
	 
	 
	 @RequestMapping(path= "/mentorLogin", method = RequestMethod.POST)
	    public ModelAndView registerCompany( @ModelAttribute("mentorlogin") @Valid Mentor mentor, BindingResult result,
	                  HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {

	     ModelAndView mav = null;
	     String email = mentor.getEmail();
	     List<Mentor> mentor1 = mentorservice.findByEmail(email);
	     Mentor mentor2 = mentor1.get(0);
	     System.out.println(mentor.getEmail()+" "+mentor2.getEmail());
	     System.out.println(mentor.getPassword()+" "+mentor2.getPassword());
	     if (( mentor.getEmail().equals(mentor2.getEmail())) && (mentor.getPassword().equals(mentor2.getPassword())))
	     {
	                  
	    	 mav = new ModelAndView("MentorLandingPage");
	            
	     } 
	     else 
	     {

	         mav = new ModelAndView("LoginError", "message", "Invalid Username or Password");
	     }
	  
	     return mav;

	    }
	 
	 @RequestMapping(path="/mentorblock", method = RequestMethod.GET)
	    public ModelAndView mentorblock(ModelMap map) throws SQLException {
	          ModelAndView mav = null;
	          ArrayList mentorList =(ArrayList)mentorservice.getMentorList();
	          mav = new ModelAndView("MentorBlock");
	          mav.addObject("mlist",mentorList);
	          return mav;

	    } 
	 }
