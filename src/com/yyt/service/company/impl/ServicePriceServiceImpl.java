package com.yyt.service.company.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.company.ServicePrice;
import com.yyt.service.company.ServicePriceService;

@Service
@Transactional
public class ServicePriceServiceImpl extends BaseDaoImpl<ServicePrice> implements ServicePriceService{

}
