package com.yyt.service.company.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.company.ServiceProject;
import com.yyt.service.company.ServiceProjectService;
@Service
@Transactional
public class ServiceProjectServiceImpl extends BaseDaoImpl<ServiceProject> implements ServiceProjectService{

}
