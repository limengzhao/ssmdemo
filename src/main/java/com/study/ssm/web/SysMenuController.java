package com.study.ssm.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.study.ssm.core.User;
import com.study.ssm.service.serviceImpl.SysMenuServiceImpl;
import com.study.ssm.utils.JsonUtils;

@Controller
public class SysMenuController {

	@Autowired
	private SysMenuServiceImpl sysMenuServiceImpl;
	
	@RequestMapping(value="doMenuListUI")
	public String doMemuListUI() {
		
		return "sys/menu_list";
	}
	
	@RequestMapping(value="doFindObjects",produces="application/json; charset=UTF-8",method = RequestMethod.POST)
    public ModelAndView doFindObjects(User model, HttpSession session) {
		List<Map<String, Object>> menuList = sysMenuServiceImpl.findObjects();
            session.setAttribute("menuList", menuList);
            ModelAndView mav = new ModelAndView();
            mav.setViewName("index");
            return mav;
    }
}
