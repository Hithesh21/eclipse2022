package com.xworkz.controller.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class HitheshInit extends AbstractAnnotationConfigDispatcherServletInitializer 
implements WebMvcConfigurer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("running getRootConfigClasses....");

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("running getServletConfigClasses");
		Class[] ref= {HitheshConfig.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
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
