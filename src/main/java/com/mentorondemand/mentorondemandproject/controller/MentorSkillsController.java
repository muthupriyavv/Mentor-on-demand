package com.mentorondemand.mentorondemandproject.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.mentorondemand.mentorondemandproject.model.MentorSkills;
import com.mentorondemand.mentorondemandproject.service.MentorService;
import com.mentorondemand.mentorondemandproject.service.MentorSkillsService;

@Controller
public class MentorSkillsController {
	
	@Autowired
	private MentorSkillsService mentorskillsservice;
	@Autowired
	private MentorService mentorservice;
	
	
	 
	 @RequestMapping(path="/addmentorskills", method = RequestMethod.GET)
	    public ModelAndView mentorskills(Model model) throws SQLException {
	          ModelAndView mv = new ModelAndView();
	          mv.setViewName("AddMentorSkills");
	          ArrayList mentorDetails =(ArrayList)mentorservice.getMentorList();
	          mv.addObject("mentorList",mentorDetails);
	          model.addAttribute("skills",new MentorSkills());
	          return mv;

	    } 
	
	
	
	 @RequestMapping(value = "/addmentorskills", method = RequestMethod.POST)
	    public ModelAndView registerMentorSkills( @ModelAttribute("skills") @Valid MentorSkills mentorskills, BindingResult result,
	                  HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
	           ModelAndView mav = null;
		
		       if (result.hasErrors()) 
		       { mav = new ModelAndView("AddMentorSkills"); return mav; }
		 
	           System.out.println(mentorskills);
	           mentorskillsservice.addskills(mentorskills);
	           ArrayList mentorDetails =(ArrayList)mentorservice.getMentorList();
	           mav = new ModelAndView("MentorLandingPage");
	           mav.addObject("mentorList",mentorDetails);
		       return mav;
		         
	           }
	 
	
    
	

}
