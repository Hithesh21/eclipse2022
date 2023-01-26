package com.xworkz.season.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.season.bean.Area;
import com.xworkz.season.bean.Assistant;
import com.xworkz.season.bean.Battery;
import com.xworkz.season.bean.Camera;
import com.xworkz.season.bean.CameraMan;
import com.xworkz.season.bean.Capacity;
import com.xworkz.season.bean.Company;
import com.xworkz.season.bean.Director;
import com.xworkz.season.bean.Experience;
import com.xworkz.season.bean.Location;
import com.xworkz.season.bean.Movie;
import com.xworkz.season.bean.Producer;
import com.xworkz.season.bean.Skill;

@Configuration
@ComponentScan("com.xworkz.season.bean")
public class ConfigurationSpring {
	
	public ConfigurationSpring() {
		// TODO Auto-generated constructor stub
		System.out.println("created no-args const of Configuration spring.........");

	}
	/* @Bean
	public Movie director() {
		System.out.println("registering Director in spring");
		Movie ref=new Movie();
		ref.setDirector(Director.class);
		return ref;
	}
	@Bean
	public Movie producer() {
		System.out.println("registering producer in spring");
		Movie ref=new Movie();
		ref.setProducer(Producer.class);
		return ref;
	}
	@Bean("experience")
	public Director experience() {
		System.out.println("registering exp in spring");
		Director ref=new Director();
		ref.setExperience(Experience.class);
		return ref;
	}
	@Bean("cameraMan")
	public Director cameraMan() {
		System.out.println("registering camera man in spring");
		Director ref=new Director();
		ref.setCameraMan(CameraMan.class);
		
		return ref;
	}
	@Bean
	public Experience skill() {
		System.out.println("registering company  in spring");
		Experience ref=new  Experience();
		ref.setSkill(Skill.class);
		return ref;
	}
	@Bean
	public CameraMan camera() {
		System.out.println("registering camera  in spring");
		CameraMan ref=new CameraMan();
		ref.setCamera(Camera.class);
		return ref;
	}
	@Bean
	public Camera battery() {
		System.out.println("registering battery  in spring");
		Camera ref=new Camera();
		ref.setBattery(Battery.class);
		return ref;
	}
	@Bean
	public Battery capacity() {
		System.out.println("registering capacity  in spring");
		Battery ref=new  Battery();
		ref.setCapacity(Capacity.class);
		return ref;
	}
	@Bean
	public Location area() {
		System.out.println("registering area  in spring");
		Location ref=new   Location();
		ref.setArea(Area.class);
		return ref;
	}
	@Bean
	public Company location() {
		System.out.println("registering loc  in spring");
		Company ref=new    Company();
		ref.setLocation(Location.class);
		
		return ref;
	}
	@Bean
	public Assistant company() {
		System.out.println("registering company  in spring");
		Assistant ref=new     Assistant();
		ref.setCompany(Company.class);
		return ref;
	}
	@Bean
	public Producer assist() {
		System.out.println("registering assistant  in spring");
		Producer ref=new      Producer();
		ref.setAssist(Assistant.class);
		return ref;
	}
	@Bean
	public Area name() {
		System.out.println("registering name  in spring");
		Area ref=new Area();
		ref.setName("rjn");
				return ref;
	}
	@Bean
	public Skill type() {
		System.out.println("registering type  in spring");
		Skill ref=new Skill();
		ref.setMusic("music and sing");
				return ref;
	}
	@Bean
	public Capacity charge() {
		System.out.println("registering charge  in spring");
		Capacity ref=new Capacity();
		ref.setCharge(2000);
				return ref;
	} */
}
