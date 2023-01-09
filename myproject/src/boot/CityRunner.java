package boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ConfigurationSpring;
import things.Application;
import things.City;

public class CityRunner {

	public static void main(String[] args) {

		
		ApplicationContext con=new AnnotationConfigApplicationContext(ConfigurationSpring.class);
		City ref=con.getBean(City.class);
		System.out.println(ref.toString());
		
		Application app=con.getBean(Application.class);
		System.out.println(app.toString());

	}

}
