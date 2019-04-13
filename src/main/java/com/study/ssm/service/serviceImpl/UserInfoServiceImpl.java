package com.study.ssm.service.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.ssm.core.User;
import com.study.ssm.dao.UserInfoDao;
import com.study.ssm.service.UserInfoDaoService;

@Service
public class UserInfoServiceImpl implements UserInfoDaoService {

	@Autowired
	private UserInfoDao userDao;
	
	
	public User findByUserName(String username) {
		return userDao.findByUserName(username);
	}
	
	
	

}
