package com.xworkz.ship.controller;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.ship.controller.configuration.ShipConfiguration;

public class BeachInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses....");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		Class[] ref= {ShipConfiguration.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		String[] str= {"/"};
				
		return str;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configureDefaultServletHandling....");
		configurer.enable();
		
	}

}
