package com.study.ssm.dao;

import com.study.ssm.core.User;

public interface UserInfoDao {
	
	public abstract User findByUserName(String username);

}
