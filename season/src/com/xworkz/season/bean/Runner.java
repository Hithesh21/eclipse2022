package com.xworkz.season.bean;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.season.configuration.ConfigurationSpring;

public class Runner {

	public static void main(String[] args) {


		ApplicationContext spring=new AnnotationConfigApplicationContext(ConfigurationSpring.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		System.out.println(spring.getBeanDefinitionCount());
		
	  Movie	ref=spring.getBean(Movie.class);
	  System.out.println(ref.hashCode());
	
	}

}
