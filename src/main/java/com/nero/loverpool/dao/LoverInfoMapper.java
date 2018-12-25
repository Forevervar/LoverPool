package com.nero.loverpool.dao;

import com.nero.loverpool.model.LoverInfo;

public interface LoverInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(LoverInfo record);

    int insertSelective(LoverInfo record);

    LoverInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LoverInfo record);

    int updateByPrimaryKey(LoverInfo record);
}