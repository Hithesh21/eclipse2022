package com.xworkz.confi;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class InterviewDTO {
	
	private String name;
	private String company;
	private double experience;
	private String role;



	
	public InterviewDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("created : " + getClass().getSimpleName());

	}
	

}
