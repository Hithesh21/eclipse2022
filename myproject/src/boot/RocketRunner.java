package boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.SpringRocket;
import things.Actor;
import things.Rocket;
import things.Season;

public class RocketRunner {

	public static void main(String[] args) {

		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringRocket.class);
		Rocket refName=spring.getBean("rocket",Rocket.class);
		System.out.println(refName);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));

		
		Rocket refOfRock=spring.getBean("launch",Rocket.class);
		System.out.println(refOfRock);
		//System.out.println(refOfRock.toString());
		System.out.println(refOfRock.getCountry());
		System.out.println(refOfRock.getName());
		System.out.println(refOfRock.getBudget());
		
		Rocket refOfRock1=spring.getBean("check",Rocket.class);
		System.out.println(refOfRock1);
		//System.out.println(refOfRock1.toString());
		System.out.println(refOfRock1.getCountry());
		System.out.println(refOfRock1.getName());
		System.out.println(refOfRock1.getBudget());
		
		Actor actor=spring.getBean("actor",Actor.class);
		System.out.println(actor);
		
		Actor refOfActor=spring.getBean("fun",Actor.class);
		System.out.println( refOfActor.getName());
		System.out.println( refOfActor.getLanguage());
		System.out.println( refOfActor.getAge());
		
		Actor refOfActor1=spring.getBean("act",Actor.class);
		System.out.println( refOfActor1.getName());
		System.out.println( refOfActor1.getLanguage());
		System.out.println( refOfActor1.getAge());
		
		Season season=spring.getBean("season",Season.class);
		System.out.println(season);
		
		Season refOfSeason=spring.getBean("hot",Season.class);
		System.out.println(refOfSeason);
         System.out.println(refOfSeason.getName());
         System.out.println(refOfSeason.getDuration());
         System.out.println(refOfSeason.getStartingMonth());
         
         Season refOfSeason1=spring.getBean("holiday",Season.class);
         System.out.println(refOfSeason1);
         System.out.println(refOfSeason1.getName());
         System.out.println(refOfSeason1.getDuration());
         System.out.println(refOfSeason1.getStartingMonth());
	}
	}


