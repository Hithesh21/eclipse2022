package com.xworkz.cllection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

import com.xworkz.cllection.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) throws Exception {

		
		SanitizerDTO dto=new SanitizerDTO("patanjali", "blue", 219, 40);
		SanitizerDTO dto1=new SanitizerDTO("lifeboy", "blue", 210, 42);
		SanitizerDTO dto2=new SanitizerDTO("clear", "orange", 202, 30);
		SanitizerDTO dto3=new SanitizerDTO("clean", "blue", 310, 200);
		SanitizerDTO dto4=new SanitizerDTO("fresh", "blue", 204, 140);
		SanitizerDTO dto5=new SanitizerDTO("himalaya", "orange", 521, 120);
		SanitizerDTO dto6=new SanitizerDTO("naturo", "white", 621, 90);
		SanitizerDTO dto8=new SanitizerDTO("best", "white", 821, 80);
		SanitizerDTO dto9=new SanitizerDTO("santoor", "blue", 921, 110);
		SanitizerDTO dto10=new SanitizerDTO("lux", "orange",1021, 210);
		SanitizerDTO dto0=new  SanitizerDTO(null, "orange",1021, 190);
		
		Collection<SanitizerDTO> sanit=new ArrayList<SanitizerDTO>();
		sanit.add(dto);
		sanit.add(dto1);
		sanit.add(dto2);
		sanit.add(dto4);
		sanit.add(dto3);
		sanit.add(dto5);
		sanit.add(dto6);
		sanit.add(dto8);
		sanit.add(dto9);
		sanit.add(dto10);
		sanit.add(dto0);
		
		System.out.println(sanit.size());
		System.out.println(sanit);
				Iterator<SanitizerDTO> itr=sanit.iterator();
		while(itr.hasNext()) {
			SanitizerDTO ele=itr.next();
			if (ele.getBrand() == null || ele.getColor() == null || ele.getPrice() == 0 || ele.getId() == 0) {
				System.err.println(ele);
		}
		
		}
		
		
		System.out.println("========================================================");
		Iterator<SanitizerDTO> itr1=sanit.iterator();
		while(itr1.hasNext()) {
			SanitizerDTO ele1=itr1.next();
			
			if(ele1.getPrice()>=200)
			{
				System.out.println("the low price is : " +ele1 );
			}
		}
		System.out.println("========================================================");
		
		Iterator<SanitizerDTO> itr2=sanit.iterator();
		while(itr2.hasNext()) {
			SanitizerDTO ele2=itr2.next();
			
			if(ele2.getPrice()<=30)
			{
				System.out.println("the low price is : " +ele2 );
			}
		}
		System.out.println("========================================================");
		
		Iterator<SanitizerDTO> itr3=sanit.iterator();
		while(itr1.hasNext()) {
			SanitizerDTO ele3=itr3.next();
			
			if(ele3.getColor()=="blue")
			{
				itr.remove();
				System.out.println(ele3.getBrand());
				System.out.println("after remove");
				System.out.println(sanit);
			}
		}
		
		System.out.println("========================================================");
		//System.out.println("after remove");
		//System.out.println(sanit);
		
		
		
	}}


