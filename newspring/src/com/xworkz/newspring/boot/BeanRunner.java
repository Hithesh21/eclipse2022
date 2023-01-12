package com.xworkz.newspring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.newspring.bean.Engine;
import com.xworkz.newspring.bean.NewsPaper;
import com.xworkz.newspring.configuration.ConfigurationSpring;




public class BeanRunner {

	public static void main(String[] args) {

		
		ApplicationContext spring=new AnnotationConfigApplicationContext(ConfigurationSpring.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		System.out.println(spring.getBeanDefinitionCount());
		
		NewsPaper  refName=spring.getBean(NewsPaper.class);
		System.out.println(refName);
		
		Engine  refName1=spring.getBean(Engine.class);
		System.out.println(refName1);
	}

}
