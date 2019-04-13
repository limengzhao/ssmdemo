package com.study.ssm.utils;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class JsonUtils {
	
	public static String JsonResult(List<Map<String, Object>> objectList) {
		
		return JSONObject.toJSONString(objectList);
	}

}
