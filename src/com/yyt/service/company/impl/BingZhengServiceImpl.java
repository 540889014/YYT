package com.yyt.service.company.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.company.BingZheng;
import com.yyt.service.company.BingZhengService;
@Service
@Transactional
public class BingZhengServiceImpl extends BaseDaoImpl<BingZheng> implements BingZhengService{

}
