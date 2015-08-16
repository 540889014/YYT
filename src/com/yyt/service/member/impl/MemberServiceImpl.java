package com.yyt.service.member.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.member.Member;
import com.yyt.service.member.MemberService;
@Service
@Transactional
public class MemberServiceImpl extends BaseDaoImpl<Member> implements MemberService{

}
