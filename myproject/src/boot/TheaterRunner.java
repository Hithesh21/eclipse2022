package boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.SpringTheater;
import things.Theater;

public class TheaterRunner {

	public static void main(String[] args) {

		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringTheater.class);
		Theater ref=spring.getBean(Theater.class);
		System.out.println(ref);
		
		String[] beanNames=spring.getBeanDefinitionNames();
		System.out.println( Arrays.toString(beanNames) );
		
		String refOfStr=spring.getBean("show",String.class);
		System.out.println(refOfStr);
		
		String refOfStr1=spring.getBean("pop corn",String.class);
		System.out.println(refOfStr1);

		String refOfStr2=spring.getBean("seat",String.class);
		System.out.println(refOfStr2);

		String refOfStr3=spring.getBean("watch",String.class);
		System.out.println(refOfStr3);

		String refOfStr4=spring.getBean("buyTicket",String.class);
		System.out.println(refOfStr4);





	}

}
