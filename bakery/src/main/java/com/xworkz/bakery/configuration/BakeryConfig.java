package com.xworkz.bakery.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com,xworkz,bakery")
public class BakeryConfig {
	
	public BakeryConfig() {
           System.out.println("created : " + getClass().getSimpleName());
	}

}
