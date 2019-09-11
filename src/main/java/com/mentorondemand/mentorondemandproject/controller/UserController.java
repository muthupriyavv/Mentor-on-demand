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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mentorondemand.mentorondemandproject.model.Mentor;
import com.mentorondemand.mentorondemandproject.model.MentorSkills;
import com.mentorondemand.mentorondemandproject.model.Technologies;
import com.mentorondemand.mentorondemandproject.model.User;
import com.mentorondemand.mentorondemandproject.service.MentorService;
import com.mentorondemand.mentorondemandproject.service.MentorSkillsService;
import com.mentorondemand.mentorondemandproject.service.TechnologyService;
import com.mentorondemand.mentorondemandproject.service.UserService;

@Controller
public class UserController {

	/*
	 * @RequestMapping(value = "/signup", method = RequestMethod.GET) public String
	 * signup() { return "signup"; }
	 */
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private MentorService mentorservice;
	
	@Autowired
	private TechnologyService technologyservice;
	
	@Autowired
	private MentorSkillsService mentorskillsservice;
	
	
	
	 
	 @RequestMapping(path="/signup", method = RequestMethod.GET)
	    public ModelAndView signup(ModelMap map) throws SQLException {
	          ModelAndView mav = null;
	          map.addAttribute("user", new User());
	          map.addAttribute("mentor", new Mentor());
	          mav = new ModelAndView("signup");
	          return mav;

	    } 
	 
	 
	 @RequestMapping(value = "/addUser", method = RequestMethod.POST)
	    public ModelAndView registerUser( @ModelAttribute("user") @Valid User user, BindingResult result,
	                  HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {
	           ModelAndView mav = null;
	           if (result.hasErrors()) {
	                  mav = new ModelAndView("signup");
	                  return mav;
	           }
	       System.out.println(user);
	       userservice.registerUser(user);
	       mav = new ModelAndView("redirect:/Login");
	           return mav;

	    }
	 
	 
	 
	 @RequestMapping(path="/Login", method = RequestMethod.GET)
	    public ModelAndView login(ModelMap map) throws SQLException {
	          ModelAndView mav = null;
	          map.addAttribute("userlogin", new User());
	          map.addAttribute("mentorlogin", new Mentor());
	          mav = new ModelAndView("Login");
	          return mav;

	    } 
	 
	
	 @RequestMapping(path= "/userLogin", method = RequestMethod.POST)
	    public ModelAndView registerCompany( @ModelAttribute("userlogin") @Valid User user, BindingResult result,
	                  HttpServletRequest request, HttpSession session, ModelMap map) throws SQLException {

	     ModelAndView mav = null;
	     String email = user.getEmail();
	     List<User> user1 = userservice.findByEmail(email);
	     System.out.println(user1);
	     User user2 = user1.get(0);
	     System.out.println(user.getEmail()+" "+user2.getEmail());
	     System.out.println(user.getPassword()+" "+user2.getPassword());
	     if (( user.getEmail().equals(user2.getEmail())) && (user.getPassword().equals(user2.getPassword())))
	     {
	                  
	    	 mav = new ModelAndView("redirect:/userlandingpage");
	            
	     } 
	     else 
	     {

	         mav = new ModelAndView("LoginError", "message", "Invalid Username or Password");
	     }
	  
	     return mav;


	    }
	 
	 
	 @RequestMapping(path="/userlandingpage", method = RequestMethod.GET)
	    public ModelAndView UserPage(ModelMap map) throws SQLException {
	          ModelAndView mav = null;
	          map.addAttribute("tech", new Technologies());
	          ArrayList skillList= (ArrayList) technologyservice.getTechnology();
	          map.addAttribute("skillsList",skillList);
	          mav = new ModelAndView("UserLandingPage");
	          return mav;

	    } 
 
	 @RequestMapping(path = "/searchMentor")
     public ModelAndView getMentorUserList(ModelMap map,@ModelAttribute("tech") @Valid Technologies technologies,HttpServletRequest request,HttpSession session) throws Exception {

            ModelAndView mv = new ModelAndView();
            MentorSkills ms = new MentorSkills();
            ms.setSkillname(technologies.getName());
            ArrayList skillList= (ArrayList) technologyservice.getTechnology();
            System.out.println(skillList);
            map.addAttribute("tech",new Technologies());
            map.addAttribute("skillsList",skillList);
            System.out.println(ms.getSkillname());
            List<MentorSkills> mentorList =  mentorskillsservice.findBySkillname(ms.getSkillname());
            System.out.println(mentorList);
            mv.addObject("mentorList",mentorList );
            mv.setViewName("DisplayMentor");
            return mv;

     }
	 
	 @RequestMapping(path="/userblock", method = RequestMethod.GET)
	    public ModelAndView userblock(ModelMap map) throws SQLException {
	          ModelAndView mav = null;
	          ArrayList userList =(ArrayList)userservice.getUserList();
	          mav = new ModelAndView("UserBlock");
	          mav.addObject("ulist",userList);
	          return mav;

	    } 
	 
	 @RequestMapping(path="/edituserprofile", method = RequestMethod.GET)
	    public ModelAndView userprofile(ModelMap map) throws SQLException {
	          ModelAndView mav = null;
	          ArrayList userList =(ArrayList)userservice.getUserList();
	          mav = new ModelAndView("UserDetails");
	          mav.addObject("ulist",userList);
	          return mav;

	    } 
	 
	 @RequestMapping("/userupdate")
	    public ModelAndView userupdate(@RequestParam("id") int userId, ModelMap map, HttpServletRequest request,
	                  @ModelAttribute("user") User user,HttpSession session) throws ClassNotFoundException, SQLException {
	                        ModelAndView mav = null;
	                        user = userservice.fetchuserupdate(userId);
	                        map.addAttribute("userupdate", user);
	                        mav = new ModelAndView("UserUpdate");
	                        return mav;
	           
	    }
	 @RequestMapping(value = "updateuserdetails", method = RequestMethod.POST)
     public ModelAndView updatedetails(HttpServletRequest request, ModelMap map, HttpSession session,
            @ModelAttribute("user") User user, BindingResult result) throws ClassNotFoundException, SQLException
                   {
     
            ModelAndView mav = null;
                   ArrayList userDetails = null;
                   int userId = user.getId();
                   if (result.hasErrors()) {
                         User user1 = new User();
                         user1= userservice.fetchuserupdate(userId);
                         map.addAttribute("userupdate", user1);
                         mav = new ModelAndView("UserUpdate");
                         return mav;
                   }
                   userservice.updateuser(user);
                   System.out.println(user);
                   userDetails = (ArrayList) userservice.getUserList();
                   System.out.println(userDetails);
                   map.addAttribute("ulist", userDetails);
                   mav = new ModelAndView("UserDetails");
                   return mav;
           
     }

	}


	 
	 


