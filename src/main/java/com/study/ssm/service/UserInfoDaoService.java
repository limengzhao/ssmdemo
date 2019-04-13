package com.study.ssm.service;

import com.study.ssm.core.User;

public interface  UserInfoDaoService {
	
	public abstract User findByUserName(String username);
	
}
