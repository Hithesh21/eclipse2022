package com.xworkz.ship.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.ship.dto.BeachDTO;

@Component
@RequestMapping("/beach")
public class BeachComponent {
	
	public BeachComponent() {
           System.out.println("created : " + getClass().getSimpleName());
	}

	@PostMapping
	public String onAttend(BeachDTO dto,Model model) {
		System.out.println("running on attend post");

	System.out.println(dto.getName());
	System.out.println(dto.getLocation());
	System.out.println(dto.getGames());
	System.out.println(dto.isClean());
	Model ref= model.addAttribute("name");
	Model ref1=model.addAttribute("location");
	System.out.println(ref);
	System.out.println(ref1);

		return "BeachSuccess.jsp";
	}
}
