package com.nero.loverpool.dao;

import com.nero.loverpool.model.RelationShip;
import org.apache.ibatis.annotations.Param;

public interface RelationShipMapper {
    int deleteByPrimaryKey(@Param("boyfriendid") String boyfriendid, @Param("grilfriendid") String grilfriendid);

    int insert(RelationShip record);

    int insertSelective(RelationShip record);
}