package com.yyt.orm.member.util;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class SatisfactionConvert extends StrutsTypeConverter{

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		Satisfaction[] satisfactiones = Satisfaction.values();
		for(Satisfaction satisfaction:satisfactiones){
			if(satisfaction.getName().equals(arg1[0])){
				return satisfaction;
			}
		}
		return null;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		Satisfaction satisfaction = (Satisfaction) arg1;
		return satisfaction.getName();
	}

}
