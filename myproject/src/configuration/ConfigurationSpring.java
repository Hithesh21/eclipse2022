package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("things")
public class ConfigurationSpring {
	
	public ConfigurationSpring() {
		System.out.println("running ConfigurationSpring........");
	}

	@Bean
	public int id() {
		System.out.println("regestering id with spring");
		return 28;
	}
	
	@Bean
	public String name() {
		System.out.println("regestering name with spring");
		return "abc hard ware";
	}
	@Bean
	public String owner() {
		System.out.println("regestering owner with spring");
		return "Ramesh";
	}
	@Bean
	public String address() {
		System.out.println("regestering address with spring");
		return "Rajajinagar";
	}
	@Bean("name1")
	public String name1() {
		System.out.println("regestering name1 with spring");
		return "java";
	}
	@Bean
	public String developer() {
		System.out.println("regestering developer with spring");
		return "james";
	}
	@Bean
	public String date() {
		System.out.println("regestering date with spring");
		return "1992";
	}
	@Bean
	public double version() {
		System.out.println("regestering version with spring");
		return 1.1;
	}
	@Bean
	public boolean free() {
		System.out.println("regestering free with spring");
		return true;
	}
	
	@Bean("name2")
	public String name2() {
		System.out.println("regestering name2 with spring");
		return "hithesh";
	}
	@Bean
	public String company() {
		System.out.println("regestering company with spring");
		return "IBM";
	}
	@Bean
	public double salary() {
		System.out.println("regestering salary with spring");
		return 80000;
	}
	@Bean
	public boolean experience() {
		System.out.println("regestering experience with spring");
		return true;
	}
	@Bean("name3")
	public String name3() {
		System.out.println("regestering name3 with spring");
		return "Santhosh";
	}
	@Bean
	public short age() {
		System.out.println("regestering company with spring");
		return 22;
	}
	@Bean
	public double income() {
		System.out.println("regestering income with spring");
		return 80000;
	}
	@Bean
	public boolean fun() {
		System.out.println("regestering fun with spring");
		return true;
	}
	@Bean
	public long mobile() {
		System.out.println("regestering mobile with spring");
		return 984509999;
	}
	@Bean
	public float height() {
		System.out.println("regestering height with spring");
		return 5.4f;
	}
	@Bean("id1")
	public int id1() {
		System.out.println("regestering company with spring");
		return 201;
	}
	@Bean
	public char shoeSize() {
		System.out.println("regestering company with spring");
		return '8';
	}
	

	
	
}
