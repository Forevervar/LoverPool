package com.nero.loverpool.service;

import com.nero.loverpool.model.Lover;

public interface LoverService {
	public Lover getLover(Lover lover);
	
	public int insertLover(Lover lover) throws Exception;
}
