package com.dash.production.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="unit_details")
public  class unit {
	@Id
	private String unitId;
	
	@Column(name="date")
	private String date;
	@Column(name="supervisor_id")
	private String supervisorId;
	
	@Column(name="present_employee")
	private int presentEmployee;
	
	@Column(name="absent_employee")
	private int absentEmployee;
	
	@Column(name="total_production")
	private int totalProduction;
	
	@Column(name="damage_count")
	private int damageCount;
	
	
	
	
	public unit() {
		
		
		
		
	}
	
	public unit(String unitId, String date, String supervisorId, int presentEmployee, int absentEmployee,
			int totalProduction, int damageCount) {
		super();
		this.unitId = unitId;
		this.date = date;
		this.supervisorId = supervisorId;
		this.presentEmployee = presentEmployee;
		this.absentEmployee = absentEmployee;
		this.totalProduction = totalProduction;
		this.damageCount = damageCount;
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSupervisorId() {
		return supervisorId;
	}
	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}
	public int getPresentEmployee() {
		return presentEmployee;
	}
	public void setPresentEmployee(int presentEmployee) {
		this.presentEmployee = presentEmployee;
	}
	public int getAbsentEmployee() {
		return absentEmployee;
	}
	public void setAbsentEmployee(int absentEmployee) {
		this.absentEmployee = absentEmployee;
	}
	public int getTotalProduction() {
		return totalProduction;
	}
	public void setTotalProduction(int totalProduction) {
		this.totalProduction = totalProduction;
	}
	public int getDamageCount() {
		return damageCount;
	}
	public void setDamageCount(int damageCount) {
		this.damageCount = damageCount;
	}
	
	
	
	

}
