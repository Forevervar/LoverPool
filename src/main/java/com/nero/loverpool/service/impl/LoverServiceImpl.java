package com.nero.loverpool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.nero.loverpool.dao.LoverMapper;
import com.nero.loverpool.model.Lover;
import com.nero.loverpool.service.LoverService;
import com.nero.loverpool.utils.LoverConstant;
import com.nero.loverpool.utils.LoverException;

@Service
public class LoverServiceImpl implements LoverService {

	@Autowired
	LoverMapper loverMapper;
	
	@Override
	public Lover getLover(Lover lover) {
		return loverMapper.selectByPrimaryKey(lover.getLovername());
	}

	@Override
	public int insertLover(Lover lover) throws Exception{
		if(StringUtils.isEmpty(lover.getLovername())) {
			throw new LoverException(LoverConstant.ERROR_EMPTY_NAME, "UserName can not be null!");
		}
		if(!StringUtils.isEmpty(loverMapper.selectByPrimaryKey(lover.getLovername()))) {
			throw new LoverException(LoverConstant.ERROR_DATA_EXIST, "UserName " + lover.getLovername() + " has been registered!");
		}
		return loverMapper.insert(lover);
	}

}
