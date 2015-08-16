package com.yyt.service.member.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.member.Village;
import com.yyt.service.member.VillageService;

@Service
@Transactional
public class VillageServiceImpl extends BaseDaoImpl<Village> implements VillageService{

}
