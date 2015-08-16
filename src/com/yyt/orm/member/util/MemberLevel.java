package com.yyt.orm.member.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 会员等级状态
 * @author java_one
 *
 */
public enum MemberLevel {

	LevelOne{
		public String getName(){
			return "一级";
		}
	},
	LevelTwo{
		public String getName(){
			return "二级";
		}
	},
	LevelThree{
		public String getName(){
			return "三级";
		}
	}
	
	;
	public abstract String getName();
	public static List<String> getValues(){
		List<String> list = new ArrayList<String>();
		for(MemberLevel memberLevel:MemberLevel.values()){
			list.add(memberLevel.getName());
		}
		return list;
	}
	
}
