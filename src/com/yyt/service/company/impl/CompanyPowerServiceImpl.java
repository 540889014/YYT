package com.yyt.service.company.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.company.CompanyPower;
import com.yyt.service.company.CompanyPowerService;

@Service
@Transactional
public class CompanyPowerServiceImpl extends BaseDaoImpl<CompanyPower> implements CompanyPowerService{

}
