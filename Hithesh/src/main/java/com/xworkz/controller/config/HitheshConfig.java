package com.xworkz.controller.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class HitheshConfig {
	
	public HitheshConfig() {
		// TODO Auto-generated constructor stub
		System.out.println("created : " + getClass().getSimpleName());

	}

}
