package com.xworkz.copy.boot;

import com.xworkz.copy.*;

public class BreadRunner {

	public static void main(String[] args) {
System.out.println("runner started");
		 
		Bread bread=new Bread();
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println(bread.companyName);
		
		Bread bread1=new Bread('s');
		System.out.println(bread1.type);
		System.out.println(bread1.shape);
		System.out.println(bread1.price);
		System.out.println(bread1.quantity);
		System.out.println(bread1.companyName);
		bread1.shape="square";
		bread1.price= 20;
		System.out.println(bread1.shape);
		System.out.println(bread1.price);
		

		Bread bread2=new Bread("super");
		System.out.println(bread2.type);
		System.out.println(bread2.shape);
		System.out.println(bread2.price);
		System.out.println(bread2.quantity);
		System.out.println(bread2.companyName);
		bread2.quantity=200;
		System.out.println(bread2.quantity);

		Bread bread3=new Bread(30);
		System.out.println(bread3.type);
		System.out.println(bread3.shape);
		System.out.println(bread3.price);
		System.out.println(bread3.quantity);
		System.out.println(bread3.companyName);
		bread3.type='b';
		System.out.println(bread3.type);
		

		Bread bread4=new Bread(30,400);
		System.out.println(bread4.type='b');
		System.out.println(bread4.shape);
		System.out.println(bread4.price);
		System.out.println(bread4.quantity);
		System.out.println(bread4.companyName);
		

		Bread bread5=new Bread("square",30);
		System.out.println(bread5.type);
		System.out.println(bread5.shape);
		System.out.println(bread5.price);
		System.out.println(bread5.quantity=200);
		System.out.println(bread5.companyName);
		

		Bread bread6=new Bread(30,180,"round");
		System.out.println(bread6.type='L');
		System.out.println(bread6.shape);
		System.out.println(bread6.price);
		System.out.println(bread6.quantity);
		System.out.println(bread6.companyName);
		

		Bread bread8=new Bread(30,90,'L');
		System.out.println(bread8.type);
		System.out.println(bread8.shape);
		System.out.println(bread8.price);
		System.out.println(bread8.quantity);
		System.out.println(bread8.companyName);
		

		Bread bread9=new Bread(30,90,'s',"square");
		System.out.println(bread9.type);
		System.out.println(bread9.shape);
		System.out.println(bread9.price);
		System.out.println(bread9.quantity);
		System.out.println(bread9.companyName);
		
		Bread bread10=new Bread(30,90,'s',"square","super");
		System.out.println(bread10.type);
		System.out.println(bread10.shape);
		System.out.println(bread10.price);
		System.out.println(bread10.quantity);
		System.out.println(bread10.companyName);
	}	}