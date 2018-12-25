package com.nero.loverpool.service;

import com.nero.loverpool.model.LoverInfo;

public interface LoverInfoService {
	
	public LoverInfo getLoverInfo(LoverInfo loverInfo);
	
	public int insertLoverInfo(LoverInfo loverInfo);
	
	public int updateLoverInfo(LoverInfo loverInfo);
}
