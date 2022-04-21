package com.dash.production.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dash.production.entity.unit;
import com.dash.production.service.UnitService;

@Controller
public class UnitController  {
	
	public UnitService unitService;

	public UnitController(UnitService unitService) {
		super();
		this.unitService = unitService;
	}
 
	
	 @GetMapping("/unit_details")
	 public String listUnits(Model model) {
		model.addAttribute("unit_details",unitService.getAllUnits());
		 return "Units";
		
		 
		 
		 
	 }
	 @GetMapping("/unit_details/new")
	 public String createUnitForm(Model model) {
		 
		unit unitobj=new unit(); 
		model.addAttribute("unit",unitobj);
		return "create_unit";
		 
	 }
	 
	 @PostMapping("/unit_details")
	 public String saveUnit(@ModelAttribute("unit") unit unitobj) {
		unitService.saveUnit(unitobj); 
		return "redirect:/unit_details";
		
		
		
		 
		 
		 
	 }
	 
	     @GetMapping("/unit_details/edit/{unitId}")
		  public String editUnitForm(@PathVariable String unitId,Model model) {
			model.addAttribute("unit",unitService.getUnitById(unitId));
			return "edit_unit";
			
			
		}
	     @PostMapping("/unit_details/{unitId}")
	     public String updateUnit(@PathVariable String unitId,@ModelAttribute("unit") unit unitobj,Model model) {
	    	 
	    	 
	    	 
	    	 unit existingUnit=unitService.getUnitById(unitId);
	    	 existingUnit.setUnitId(unitId);
	    	 existingUnit.setDate(unitobj.getDate());
	    	 existingUnit.setSupervisorId(unitobj.getSupervisorId());
	    	 existingUnit.setPresentEmployee(unitobj.getPresentEmployee());
	    	 existingUnit.setAbsentEmployee(unitobj.getAbsentEmployee());
	    	 existingUnit.setTotalProduction(unitobj.getTotalProduction());
	    	 existingUnit.setDamageCount(unitobj.getDamageCount());
	    	 
	    	 
	    	 unitService.updateUnit(existingUnit);
	    	 return "redirect:/unit_details";
	    	 
	    	 
	    	 
	    	 
	    	 
	     }
	 
	     @GetMapping("/unit_details/{unitId}")
	     public String deleteUnit(@PathVariable String unitId) {
	    	 
	    	unitService.deleteUnitById(unitId);
	    	return "redirect:/unit_details";
	    	 
	    	 
	     }
	 
}
