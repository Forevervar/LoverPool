package com.nero.loverpool.dao;

import com.nero.loverpool.model.Lover;

public interface LoverMapper {
    int deleteByPrimaryKey(String lovername);

    int insert(Lover record);

    int insertSelective(Lover record);

    Lover selectByPrimaryKey(String lovername);

    int updateByPrimaryKeySelective(Lover record);

    int updateByPrimaryKey(Lover record);
}