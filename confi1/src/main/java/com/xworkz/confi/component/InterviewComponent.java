package com.xworkz.confi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.confi.InterviewDTO;
@Component
@RequestMapping("/in")
public class InterviewComponent {
	public InterviewComponent() {
      System.out.println("created : " + getClass().getSimpleName());
	}
   @PostMapping
	public String onAttend(InterviewDTO dto) {
		System.out.println("running on attend post");

	System.out.println(dto.getName());
	System.out.println(dto.getCompany());
	System.out.println(dto.getExperience());
	System.out.println(dto.getRole());
	
		return "Interview.jsp";
	}
}
