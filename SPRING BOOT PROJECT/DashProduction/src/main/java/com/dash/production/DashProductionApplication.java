package com.dash.production;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dash.production.entity.unit;
import com.dash.production.repository.UnitRepository;



@SpringBootApplication
public class DashProductionApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DashProductionApplication.class, args);
	}
    @Autowired
    private UnitRepository unitRepository;
	@Override
	public void run(String... args) throws Exception {
	
		
	}

}
