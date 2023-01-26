package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("things")
public class SpringNewsPaper {
	
	@Bean
	public String name() {
		System.out.println("regestering name5 with spring");
		return "Prajavani";
	}
	@Bean
	public String owner() {
		System.out.println("regestering owner5 with spring");
		return "xyz";
	}
	
	@Bean
	public String language() {
		System.out.println("regestering language5 with spring");
		return "kannada";
	}
	
	@Bean
	public int id() {
		System.out.println("regestering id5 with spring");
		return 301;
	}
	
	@Bean
	public int price() {
		System.out.println("regestering company with spring");
		return 3;
	}

}
