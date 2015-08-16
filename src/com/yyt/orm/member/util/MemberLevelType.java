package com.yyt.orm.member.util;

import com.yyt.util.EnumType;

/**
 * 会员等级的Hibernate的映射类型
 * @author java_one
 *
 */
public class MemberLevelType  extends EnumType<MemberLevel>{

	public MemberLevelType() {
		super(MemberLevel.class);
		// TODO Auto-generated constructor stub
	}

}
