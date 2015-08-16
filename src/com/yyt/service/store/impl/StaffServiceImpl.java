package com.yyt.service.store.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.store.Staff;
import com.yyt.service.store.StaffService;
@Service
@Transactional
public class StaffServiceImpl extends BaseDaoImpl<Staff> implements StaffService{

}
