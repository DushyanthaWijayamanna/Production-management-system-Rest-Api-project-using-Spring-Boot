package com.dash.production.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dash.production.entity.unit;
import com.dash.production.repository.UnitRepository;
import com.dash.production.service.UnitService;

@Service
public class UnitServicImpl implements UnitService {
	
	
	private UnitRepository unitrepository;
	
	
	
	
	public UnitServicImpl(UnitRepository unitrepository) {
		super();
		this.unitrepository = unitrepository;
	}




	@Override
	public List<unit> getAllUnits(){
		//System.out.println(unitrepository.findAll().toString());
		//return null;
		
		return  unitrepository.findAll();
		
		
		
		
		
	}
	@Override
	public unit saveUnit(unit unitobj) {
		return unitrepository.save(unitobj);
		
		
		
		
	}
	
	@Override
	public unit getUnitById(String unitId) {
		return unitrepository.findById(unitId).get();
		
		
		
	}
	
	@Override
	public unit updateUnit(unit unitobj) {
		return unitrepository.save(unitobj);
		
		
		
		
	}
	
	@Override
	public void deleteUnitById(String unitId) {
		
		unitrepository.deleteById(unitId);
		
		
	}
	

}
