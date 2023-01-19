package com.xworkz.soldier.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.soldier")
public class ConfigurationSpring {
	
	public ConfigurationSpring() {
		System.out.println(getClass().getSimpleName());
	}
	@Bean
	public Validator validator() {
		System.out.println("registering validator in spring");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();                  
		
		return validator ;
		
	}

}
