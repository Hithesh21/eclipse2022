package com.xworkz.season.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	private Director director;
	@Autowired
	private Producer producer;
	
	public Movie() {
		// TODO Auto-generated constructor stub
		System.out.println("created no-args const of movie.........");

	}

	public Director getDirector() {
		return director;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public void setProducer(Class<Producer> class1) {
		// TODO Auto-generated method stub
		
	}

	public void setDirector(Class<Director> class1) {
		// TODO Auto-generated method stub
		
	}

}
