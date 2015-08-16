package com.yyt.service.store.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.store.StoreRole;
import com.yyt.service.store.StoreRoleService;
@Service
@Transactional
public class StoreRoleServiceImpl extends BaseDaoImpl<StoreRole> implements StoreRoleService{

}
