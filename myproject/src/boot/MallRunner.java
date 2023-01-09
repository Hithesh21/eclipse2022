package boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.SpringMall;
import configuration.SpringTheater;
import things.Mall;
import things.Theater;

public class MallRunner {

	public static void main(String[] args) {

		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringMall.class);
		Mall ref=spring.getBean(Mall.class);
		System.out.println(ref);
		
		String[] beanNames=spring.getBeanDefinitionNames();
		System.out.println( Arrays.toString(beanNames) );
		
		Boolean refOfStr=spring.getBean("open",Boolean.class);
		System.out.println(refOfStr);
		
		Boolean refOfStr1=spring.getBean("close",Boolean.class);
		System.out.println(refOfStr1);

		Boolean refOfStr2=spring.getBean("play",Boolean.class);
		System.out.println(refOfStr2);

		


	}

}
