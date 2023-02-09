package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping("/bake")
public class BakeryController {
	@Autowired
	private BakeryService service;
	
	public BakeryController() {
        System.out.println("created : " + getClass().getSimpleName());
	}
     @PostMapping
	public String onBakery(BakeryDTO dto,Model model) {
		System.out.println("running onBakery");
		System.out.println(dto);
		model.addAttribute("bakery",dto);
		boolean save=service.validAndSave(dto);
		System.out.println("saved  : "+save);
		
		
		return "display.jsp";
	}
}
