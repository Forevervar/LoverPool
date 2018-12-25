package com.nero.loverpool.dao;

import com.nero.loverpool.model.Matter;

public interface MatterMapper {
    int deleteByPrimaryKey(String matterid);

    int insert(Matter record);

    int insertSelective(Matter record);

    Matter selectByPrimaryKey(String matterid);

    int updateByPrimaryKeySelective(Matter record);

    int updateByPrimaryKey(Matter record);
}