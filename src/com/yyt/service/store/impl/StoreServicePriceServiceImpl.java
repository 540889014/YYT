package com.yyt.service.store.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.store.StoreServicePrice;
import com.yyt.service.store.StoreServicePriceService;

@Service
@Transactional
public class StoreServicePriceServiceImpl extends BaseDaoImpl<StoreServicePrice> implements StoreServicePriceService{

}
