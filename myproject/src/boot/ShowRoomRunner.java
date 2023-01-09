package boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.SpringShowroom;
import things.ShowRoom;

public class ShowRoomRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringShowroom.class);
		ShowRoom ref=spring.getBean(ShowRoom.class);
		
		String[] beanNames=spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		Double refOfDouble=spring.getBean("open",Double.class);
        System.out.println(refOfDouble);
        
        Double refOfDouble1=spring.getBean("close",Double.class);
        System.out.println(refOfDouble1);
        
        Double refOfDouble2=spring.getBean("buy",Double.class);
        System.out.println(refOfDouble2);
	}

}
