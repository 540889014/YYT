package com.yyt.service.company.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.company.CompanyStaff;
import com.yyt.service.company.CompanyStaffService;
@Service
@Transactional
public class CompanyStaffServiceImpl extends BaseDaoImpl<CompanyStaff> implements CompanyStaffService{

}
