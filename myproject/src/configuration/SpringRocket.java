package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import things.Actor;
import things.Rocket;
import things.Season;

@Configuration
@ComponentScan("things")
public class SpringRocket {
	
	public SpringRocket() {
		System.out.println("running no args const in spring......");
	}
	@Bean
	public Rocket launch() {
		System.out.println("registering launch with spring");
		Rocket ref=new Rocket();
		return ref;
	}
	@Bean
	public Rocket check() {
		System.out.println("registering check with spring");
		Rocket ref=new Rocket();
	    ref.setCountry("Japan");
		ref.setName("super");
		ref.setBudget(290);
		return ref;
	}
	@Bean
	public Actor fun() {
		System.out.println("registering fun in spring............");
		Actor actor=new Actor(null, null, 0);
		return actor;
	}
	@Bean
	public Actor act() {
		System.out.println("registering act in spring............");
		Actor actor=new Actor("arya", "telagu",22);
		return actor;
	}
	@Bean
	public Season hot() {
		System.out.println("registering hot in spring............");
		Season season=new Season();
		return season;

	}
	@Bean
	public Season holiday() {
		System.out.println("registering holiday in spring............");
		Season season=new Season();
		season.setName("rainy");
		season.setDuration(2);
		season.setStartingMonth("september");
		
		return season;
	}

}
