package boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.SpringPg;
import things.Pg;

public class PgRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringPg.class);
		Pg ref=spring.getBean(Pg.class);
		System.out.println(ref);
		
		String[] refNames= spring.getBeanDefinitionNames();
              System.out.println(Arrays.toString(refNames));
              
              StringBuffer refOfStr=spring.getBean("create",StringBuffer.class);
              System.out.println(refOfStr);
              
              StringBuffer refOfStr1=spring.getBean("save",StringBuffer.class);
              System.out.println(refOfStr1);
	}

}
