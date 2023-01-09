package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("things")
public class ConfigurationSpring {
	
	public ConfigurationSpring() {
		System.out.println("running ConfigurationSpring........");
	}

}
