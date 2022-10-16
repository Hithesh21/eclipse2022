package com.xworkz.copy.boot;

import com.xworkz.copy.Tractor;

public class TractorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("runner of tractor");
		new Tractor();
		System.out.println("1===================");	
		Tractor tractor=null;
		System.out.println(tractor);
		Tractor tractor1= new Tractor("abc");
		System.out.println(tractor1.ownerName);
		System.out.println(tractor1.brand);
		System.out.println(tractor1.color);
		System.out.println(tractor1.price);
		System.out.println(tractor1.hp);
		System.out.println(tractor1.model);
		
		System.out.println("2===================");	
		Tractor tractor2= new Tractor("abc","mahindra","blue");
		System.out.println(tractor2.ownerName);
		System.out.println(tractor2.brand);
		System.out.println(tractor2.color);
		System.out.println(tractor2.price=400000);
		System.out.println(tractor2.hp=2000);
		System.out.println(tractor2.model="shakthi");
		
		System.out.println("3===================");	
		Tractor tractor3= new Tractor("abc","mahindra",410000);
		System.out.println(tractor3.ownerName);
		System.out.println(tractor3.brand);
		System.out.println(tractor3.color);
		System.out.println(tractor3.price);
		System.out.println(tractor3.hp=2000);
		System.out.println(tractor3.model="shakthi");
		
		System.out.println("4===================");	
		Tractor tractor4= new Tractor("abc","mahindra",2000.1);
		System.out.println(tractor4.ownerName);
		System.out.println(tractor4.brand);
		System.out.println(tractor4.color);
		System.out.println(tractor4.price);
		System.out.println(tractor4.hp);
		System.out.println(tractor4.model="shakthi");
		
		System.out.println("5===================");	
		Tractor tractor5= new Tractor("abc","mahindra");
		System.out.println(tractor5.ownerName);
		System.out.println(tractor5.brand);
		System.out.println(tractor5.color);
		System.out.println(tractor5.price=400000);
		System.out.println(tractor5.hp=2000);
		System.out.println(tractor5.model="shakthi");
		
		System.out.println("6===================");	
		Tractor tractor6= new Tractor("abc","mahindra","color",48000);
		System.out.println(tractor6.ownerName);
		System.out.println(tractor6.brand);
		System.out.println(tractor6.color);
		System.out.println(tractor6.price);
		System.out.println(tractor6.hp);
		System.out.println(tractor6.model="shakthi");
		
		
		
		System.out.println("8===================");	
		Tractor tractor8= new Tractor("abc","mahindra","orange",200000,180);
		System.out.println(tractor8.ownerName);
		System.out.println(tractor8.brand);
		System.out.println(tractor8.color);
		System.out.println(tractor8.price);
		System.out.println(tractor8.hp);
		System.out.println(tractor8.model="super");
		
	}

}
