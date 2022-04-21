package com.dash.production.service;

import java.util.List;

import com.dash.production.entity.unit;

public interface UnitService {
	List<unit> getAllUnits();
	
	unit saveUnit(unit unitobj);
	
	unit getUnitById(String unitId);
	unit updateUnit(unit unitobj);
	
	void deleteUnitById(String unitId);

	//unit getUnitById(String unitId);

}
