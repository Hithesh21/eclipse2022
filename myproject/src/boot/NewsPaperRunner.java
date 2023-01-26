package boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ConfigurationSpring;
import things.NewsPaper;

public class NewsPaperRunner {

	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(ConfigurationSpring.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		NewsPaper  refName=spring.getBean(NewsPaper.class);
		System.out.println(refName);

	}

}
