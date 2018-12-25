package com.nero.loverpool.service;

import com.nero.loverpool.model.RelationShip;

public interface RelationShipService {
	
	public RelationShip getRelationShip(RelationShip relationShip);
	
	public int deleteRelationShip(RelationShip relationShip);
	
	public int insertRelationShip(RelationShip relationShip);
}
