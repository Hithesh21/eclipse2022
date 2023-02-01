package com.xworkz.confi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/show")
public class FiComponent {
	
	public FiComponent() {
System.out.println("created : " + getClass().getSimpleName());
	}
	@PostMapping
public String onSend(@RequestParam String name,@RequestParam String type,
		@RequestParam String quantity,@RequestParam double price) {
	System.out.println("running on send post");
	System.out.println("Name : "+name);
	System.out.println("Type : "+type);
	System.out.println("Quantity : "+quantity);
	System.out.println("Price : "+price);
	
		return "FoodItem.jsp";
}

}
