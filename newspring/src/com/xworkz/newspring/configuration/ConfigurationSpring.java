package com.xworkz.newspring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.newspring.bean")
public class ConfigurationSpring {
	public ConfigurationSpring() {
		System.out.println("running ConfigurationSpring...........");
	}
	@Bean
	public String name() {
		System.out.println("regestering name5 with spring");
		return "Prajavani";
	}
	@Bean
	public String owner() {
		System.out.println("regestering owner5 with spring");
		return "xyz";
	}
	
	@Bean
	public String language() {
		System.out.println("regestering language5 with spring");
		return "kannada";
	}
	
	@Bean
	public int id() {
		System.out.println("regestering id5 with spring");
		return 301;
	}
	
	@Bean
	public int price() {
		System.out.println("regestering company with spring");
		return 3;
	}
	@Bean("name1")
	public String name1() {
		System.out.println("regestering name1 with spring");
		return "hero 123";
	}
	@Bean("owner1")
	public String owner1() {
		System.out.println("regestering owner1 with spring");
		return "xyz";
	}
	@Bean
	public String brand() {
		System.out.println("regestering brand with spring");
		return "hero moto";
	}
	@Bean
	public String mfrloc() {
		System.out.println("regestering location with spring");
		return "pune";
	}
	@Bean
	public String color() {
		System.out.println("regestering color with spring");
		return "blue";
	}
	@Bean
	public String type() {
		System.out.println("regestering type with spring");
		return "petrol";
	}
	@Bean
	public String size() {
		System.out.println("regestering size with spring");
		return "small";
	}
	@Bean
	public String officeAddress() {
		System.out.println("regestering office with spring");
		return "noida";
	}
	@Bean
	public String shape() {
		System.out.println("regestering shape with spring");
		return "square";
	}
	@Bean("id1")
	public int id1() {
		System.out.println("regestering id with spring");
		return 22;
	}
	@Bean
	public int version() {
		System.out.println("regestering version with spring");
		return 01;
	}
	@Bean
	public int bhp() {
		System.out.println("regestering bhp with spring");
		return 2200;
	}
	@Bean
	public int noOfStaff() {
		System.out.println("regestering staff with spring");
		return 2100;
	}
	@Bean("price1")
	public int price1() {
		System.out.println("regestering company with spring");
		return 30000;
	}
	@Bean
	public boolean imported() {
		System.out.println("regestering imported with spring");
		return false;
	}
	@Bean
	public boolean quality() {
		System.out.println("regestering quality with spring");
		return true;
	}
}
