package com.yyt.orm.member.util;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class MemberConvert extends StrutsTypeConverter{

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		MemberLevel[] memberLeveles = MemberLevel.values();
		for(MemberLevel memberLevel:memberLeveles){
			if(memberLevel.getName().equals(arg1[0])){
				return memberLevel;
			}
		}
		return null;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		MemberLevel memberLevel = (MemberLevel) arg1;
		return memberLevel.getName();
	}

}
