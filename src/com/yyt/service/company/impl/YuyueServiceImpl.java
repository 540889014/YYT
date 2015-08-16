package com.yyt.service.company.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.company.Yuyue;
import com.yyt.service.company.YuyueService;
@Service
@Transactional
public class YuyueServiceImpl extends BaseDaoImpl<Yuyue> implements YuyueService{

}
