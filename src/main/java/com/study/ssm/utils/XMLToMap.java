package com.study.ssm.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Element;

public class XMLToMap {
	
	
	
	public static Map<String,Map<String,Map<String,String>>> XMLToMap(Element element,Map outXMLMap){
		Map map=new HashMap();
		
		List<Element> el=element.elements();
		for (Element els : el) {
			String ename=els.getName();
			String evalue=els.getText();
			System.out.println(ename+"====="+evalue);
		}
		
		
		return outXMLMap;
		
	}

}
