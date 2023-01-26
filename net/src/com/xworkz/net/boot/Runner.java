package com.xworkz.net.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.net.bean.Browser;
import com.xworkz.net.bean.Chorme;
import com.xworkz.net.bean.PetrolBunk;
import com.xworkz.net.configuration.NetConfiguration;

public class Runner {
	public static void main(String[] args) {
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(NetConfiguration.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		System.out.println(spring.getBeanDefinitionCount());
		
		Browser ref=spring.getBean("chorme",Browser.class);
		System.out.println(ref);
		ref.browse();
		Browser ref1=spring.getBean("internetExplorer",Browser.class);
		System.out.println(ref1);
		ref1.browse();
		
		PetrolBunk ref2=spring.getBean(PetrolBunk.class);
		ref2.purchase();

		
	}

}
