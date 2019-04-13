package com.study.ssm.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.ssm.dao.SysMenuDao;
import com.study.ssm.service.SysMenuDaoService;

@Service
public class SysMenuServiceImpl implements SysMenuDaoService {
	
	@Autowired
	private SysMenuDao sysMenuDao; 
	
	@Override
	public List<Map<String, Object>> findObjects() {
		return sysMenuDao.findObjects();
	}

}
