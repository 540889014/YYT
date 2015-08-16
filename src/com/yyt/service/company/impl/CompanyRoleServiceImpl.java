package com.yyt.service.company.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.company.CompanyRole;
import com.yyt.service.company.CompanyRoleService;
@Service
@Transactional
public class CompanyRoleServiceImpl extends BaseDaoImpl<CompanyRole> implements CompanyRoleService{

}
