package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringMall {
	
	public SpringMall() {
		System.out.println("======SpringMall=======");
	}
	@Bean
	public boolean open() {
		System.out.println("running open .........");
		Boolean b=new Boolean(true);
		return b;
	}
	@Bean
	public boolean close() {
		System.out.println("running close .........");
		Boolean b=new Boolean(false);
		return b;
	}
	@Bean
	public boolean play() {
		System.out.println("running play .........");
		Boolean b=new Boolean(true);
		return b;
	}
}
