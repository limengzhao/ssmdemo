package com.study.ssm.dao;

import java.util.List;
import java.util.Map;

public interface SysMenuDao {
	
//  查询所有菜单以及菜单对应的上级菜单信息
	List<Map<String,Object>> findObjects();

}
