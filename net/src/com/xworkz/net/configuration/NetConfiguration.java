package com.xworkz.net.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.net")
public class NetConfiguration {
	
public NetConfiguration() {
	// TODO Auto-generated constructor stub
	System.out.println("running no-args NetConfiguration ");

}	

}
