package com.yyt.service.store.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.store.StaffReport;
import com.yyt.service.store.StaffReportService;
@Service
@Transactional
public class StaffReportServiceImpl extends BaseDaoImpl<StaffReport> implements StaffReportService{

}
