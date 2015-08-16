package com.yyt.service.company.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.company.CompanyStore;
import com.yyt.service.company.CompanyStoreService;
@Service
@Transactional
public class CompanyStoreServiceImpl extends BaseDaoImpl<CompanyStore> implements CompanyStoreService{

}
