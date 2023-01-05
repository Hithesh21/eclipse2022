package com.xworkz.cllection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.cllection.dto.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {
	
		
		Collection<ApplicationDTO> col=new ArrayList();
		
		col.add(new ApplicationDTO("paytm", "paytm inc", 2, 0, true));
		col.add(new ApplicationDTO("zoom", "google", 5, 200, false));
		col.add(new ApplicationDTO("gpay", "google", 4, 0, true));
		col.add(new ApplicationDTO("ola", "ola inc", 3, 0, true));
		col.add(new ApplicationDTO("flipkart", "flip inc", 6, 0, true));
		
		col.stream()
		.filter(ele -> ele.getVersion()>=5).map(ele -> ele.getName()).collect(Collectors.toList()).forEach(name ->System.out.println(name));
		
		System.out.println("================================================");
		
		col.stream().filter((ele) ->{return ele.isFree() && ele.getDevolopedBy().equals("google");}).
         collect(Collectors.toList()).forEach(ele ->System.out.println(ele)); 
	}

} 
