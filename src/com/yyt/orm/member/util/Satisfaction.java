package com.yyt.orm.member.util;

import java.util.ArrayList;
import java.util.List;

public enum Satisfaction {

	bumanyi{
		public String getName(){
			return "不满意";
		}
	},
	yiban{
		public String getName(){
			return "一般";
		}
	},
	manyi{
		public String getName(){
			return "满意";
		}
	};
	public abstract String getName();
	public static List<String> getValues(){
		List<String> list = new ArrayList<String>();
		for(Satisfaction satisfaction:Satisfaction.values()){
			list.add(satisfaction.getName());
		}
		return list;
	}
}
