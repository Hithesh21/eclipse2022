package boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ConfigurationSpring;
import things.HardwareShop;
import things.Person;
import things.Software;
import things.SoftwareEngineer;

public class BeanRunner {

	public static void main(String[] args) {

		
		ApplicationContext spring=new AnnotationConfigApplicationContext(ConfigurationSpring.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		HardwareShop refName=spring.getBean(HardwareShop.class);
		System.out.println(refName);
		
		String refName1=spring.getBean("name",String.class);
		System.out.println(refName1);
		Integer refName2=spring.getBean("id",Integer.class);
		System.out.println(refName2);
		
		Software refName3=spring.getBean(Software.class);
		System.out.println(refName3);

		SoftwareEngineer refName4=spring.getBean(SoftwareEngineer.class);
		System.out.println(refName4);
		
		Person  refName5=spring.getBean(Person.class);
		System.out.println(refName5);


	}

}
