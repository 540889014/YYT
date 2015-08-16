package com.yyt.service.company.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyt.dao.BaseDaoImpl;
import com.yyt.orm.company.ChildrenMusic;
import com.yyt.service.company.ChildrenMusicService;
@Service
@Transactional
public class ChildrenMusicServiceImpl extends BaseDaoImpl<ChildrenMusic> implements ChildrenMusicService{

}
