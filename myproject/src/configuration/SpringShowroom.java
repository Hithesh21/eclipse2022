package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class SpringShowroom {
	
	public SpringShowroom() {
           System.out.println("==========SpringShowroom============");
	}

	@Bean
	public double open() {
		System.out.println("running open .........");
		Double b=new Double(10.5);
		return b;
	}
	@Bean
	public double close() {
		System.out.println("running close .........");
		Double b=new Double(20.5);

		return b;
	}
	@Bean
	public double buy() {
		System.out.println("running buy .........");
		Double b=new Double(200.5);

		return b;
	}
}
