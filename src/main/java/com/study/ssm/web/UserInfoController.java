package com.study.ssm.web;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.study.ssm.core.User;
import com.study.ssm.service.serviceImpl.UserInfoServiceImpl;


/**
 * 用户控制器
 */
@Controller
//@RequestMapping(value = "/user")
public class UserInfoController {
	@Autowired(required = false)
    private UserInfoServiceImpl userServiceImpl;

    @RequestMapping("/view")
    public String view() {
    	System.out.println("================");
        return "/login";
    }

    @RequestMapping("/indexview")
    public String index() {
        return "/index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(User model, HttpSession session) {
        User user = userServiceImpl.findByUserName(model.getUsername());

        if (user == null || !user.getPassword().equals(model.getPassword())) {
            return new ModelAndView("redirect:/login.jsp");
        } else {
            session.setAttribute("user", user);
            ModelAndView mav = new ModelAndView();
            mav.setViewName("index");
            return mav;
        }
    }
}