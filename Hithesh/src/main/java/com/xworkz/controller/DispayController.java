package com.xworkz.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class DispayController {
	
	public DispayController() {
		// TODO Auto-generated constructor stub
		System.out.println("created : " + getClass().getSimpleName());

	}
     @GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("running onEmail ");
		model.addAttribute("email","HITHESH@gmail.com");
		return "index.jsp";
		}
     @GetMapping("/mobile")
 	public String onMobile(Model model) {
 		System.out.println("running onMobile ");
 		model.addAttribute("mobile","123455889");
 		return "index.jsp";
 		}
     @GetMapping("/aadhar")
  	public String onAadhar(Model model) {
  		System.out.println("running onAadhar ");
  		model.addAttribute("aadhar","1234558890089");
  		return "index.jsp";
  		}
     @GetMapping("/age")
  	public String onAge(Model model) {
  		System.out.println("running onAge ");
  		model.addAttribute("age",29);
  		return "index.jsp";
  		}
     @GetMapping("/dob")
   	public String onDOB(Model model) {
   		System.out.println("running onDOB ");
   		model.addAttribute("dob", LocalDateTime.of(1991, 6, 4, 12,00) );
   		return "index.jsp";
   		}
     @GetMapping("/salary")
   	public String onSalary(Model model) {
   		System.out.println("running onSalary ");
   		model.addAttribute("salary",50000);
   		return "index.jsp";
   		}
     @GetMapping("/best")
    	public String onfriends(Model model) {
    		System.out.println("running onfriends ");
    		List<String> ref=new ArrayList<>();
    		ref.add("shubham");
    		ref.add("darshan");
    		ref.add("karthik");
    		ref.add("akshay");
    		ref.add("hareesh");
            model.addAttribute("best",ref);
    		return "index.jsp";
    		}
     @GetMapping("/most")
 	public String onPlaces(Model model) {
 		System.out.println("running onPlaces ");
 		List<String> ref=new ArrayList<>();
 		ref.add("tumkur");
 		ref.add("belgaum");
 		ref.add("pune");
 		ref.add("ooty");
 		ref.add("hyderabad");
         model.addAttribute("most",ref);
 		return "index.jsp";
 		}
     @GetMapping("/skill")
  	public String onSkill(Model model) {
  		System.out.println("running onSkill ");
  		List<String> ref=new ArrayList<>();
  		ref.add("corejava");
  		ref.add("advance java");
  		ref.add("html");
  		ref.add("sql");
  		ref.add("excell");
  		 model.addAttribute("skill",ref);
  		return "index.jsp";
  		}

}
