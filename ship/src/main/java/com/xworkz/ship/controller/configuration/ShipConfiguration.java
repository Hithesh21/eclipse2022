package com.xworkz.ship.controller.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.ship")
public class ShipConfiguration {

	public ShipConfiguration() {
		// TODO Auto-generated constructor stub
		System.out.println("created : " + getClass().getSimpleName());

	}
}
