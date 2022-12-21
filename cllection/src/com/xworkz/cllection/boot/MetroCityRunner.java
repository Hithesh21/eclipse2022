package com.xworkz.cllection.boot;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MetroCityRunner {

	public static void main(String[] args) {
	
		Collection<String> collect=new ArrayList<String>();
 
		collect.add("bangalore");
		collect.add("mumbai");
		collect.add("kochi");
		collect.add("chennai");
		collect.add("hyderabad");
		
		System.out.println(collect);
		
		System.out.println("=======================================");
		
		for (String city : collect) {
			System.out.println(city);
		}
		
		System.out.println("==========================================");
		
		Iterator<String> city=collect.iterator();
		while(city.hasNext()) {
			String ele=city.next();
			System.out.println(ele);
		}
		
			
		}
}
