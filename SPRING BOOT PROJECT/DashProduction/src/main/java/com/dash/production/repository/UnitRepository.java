package com.dash.production.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dash.production.entity.unit;


public interface UnitRepository extends JpaRepository <unit,String> {
	
	

}
