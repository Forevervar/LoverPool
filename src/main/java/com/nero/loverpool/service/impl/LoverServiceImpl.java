package com.nero.loverpool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nero.loverpool.dao.LoverMapper;
import com.nero.loverpool.model.Lover;
import com.nero.loverpool.service.LoverService;

@Service
public class LoverServiceImpl implements LoverService {

	@Autowired
	LoverMapper loverMapper;
	
	@Override
	public Lover getLover(Lover lover) {
		return loverMapper.selectByPrimaryKey(lover.getLovername());
	}

	@Override
	public int insertLover(Lover lover) {
		return 0;
	}

}
