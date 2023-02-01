package com.xworkz.confi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration	
@ComponentScan("com.xworkz.confi")
public class FiConfiguration {

public FiConfiguration() {
	System.out.println("created : "+getClass().getSimpleName());
	}
}
