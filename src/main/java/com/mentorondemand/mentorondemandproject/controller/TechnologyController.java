package com.mentorondemand.mentorondemandproject.controller;

import java.sql.SQLException;
import java.util.ArrayList;

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
import com.mentorondemand.mentorondemandproject.model.Technologies;
import com.mentorondemand.mentorondemandproject.service.TechnologyService;

@Controller
public class TechnologyController {
	
	
	@Autowired
	private TechnologyService technologyservice;
	
	 @RequestMapping(path="/addtechnology", method = RequestMethod.GET)
	    public ModelAndView addTech(ModelMap map) throws SQLException {
	          ModelAndView mav = null;
	          map.addAttribute("tech", new Technologies());
	          mav = new ModelAndView("AddTechnology");
	          return mav;

	    } 
	 
	 @RequestMapping(value = "/addtechnology", method = RequestMethod.POST)
	    public ModelAndView registerUser( @ModelAttribute("tech") @Valid Technologies techno, BindingResult result,
	                  HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
	           ModelAndView mav = null;
	           if (result.hasErrors()) {
	                  mav = new ModelAndView("AddTechnology");
	                  return mav;
	           }
	       System.out.println(techno);
	       technologyservice.addTechnology(techno);
	       ArrayList technologyList =(ArrayList)technologyservice.getTechnology();
	       mav = new ModelAndView("DisplayTechnology");
	       mav.addObject("techList",technologyList);
	       return mav;

	    }
	 
	 
	 @RequestMapping(path="/displayTechnology", method = RequestMethod.GET)
	    public ModelAndView displayTechnology(ModelMap map) throws SQLException {
	          ModelAndView mav = null;
	          ArrayList technologyList =(ArrayList)technologyservice.getTechnology();
	          mav = new ModelAndView("DisplayTechnology");
	          mav.addObject("techList",technologyList);
	          return mav;

	    } 
	 

}
