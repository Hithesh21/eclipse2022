package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringPg {
	
	public SpringPg() {
		System.out.println("======spring pg=========");
	}
@Bean
	public StringBuffer create() {
		System.out.println("======spring buffer create=========");
		StringBuffer str=new StringBuffer("welcome");
		return str;

	}
	@Bean
	public StringBuffer save() {
		System.out.println("======spring buffer save=========");
		StringBuffer str=new StringBuffer(" save method ");
		return str;
	}
}
