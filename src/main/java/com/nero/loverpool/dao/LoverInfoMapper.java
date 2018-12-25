package com.nero.loverpool.dao;

import com.nero.loverpool.model.LoverInfo;

public interface LoverInfoMapper {
    int deleteByPrimaryKey(String lovername);

    int insert(LoverInfo record);

    int insertSelective(LoverInfo record);

    LoverInfo selectByPrimaryKey(String lovername);

    int updateByPrimaryKeySelective(LoverInfo record);

    int updateByPrimaryKey(LoverInfo record);
}