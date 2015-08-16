package com.yyt.service.store.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.store.StorePower;
import com.yyt.service.store.StorePowerService;
@Service
@Transactional
public class StorePowerServiceImpl extends BaseDaoImpl<StorePower> implements StorePowerService{

}
