package com.nero.loverpool.dao;

import com.nero.loverpool.model.Dict;
import org.apache.ibatis.annotations.Param;

public interface DictMapper {
    int deleteByPrimaryKey(@Param("dictkey") String dictkey, @Param("dictvalue") String dictvalue);

    int insert(Dict record);

    int insertSelective(Dict record);
}