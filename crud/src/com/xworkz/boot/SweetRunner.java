package com.xworkz.boot;

import com.xworkz.repo.SweetRepo;
import com.xworkz.repo.SweetRepoImpl;

public class SweetRunner {
	
	public static void main(String[] args) {
		
		
		SweetRepo sweet=new SweetRepoImpl();
		sweet.create("laadu");
		sweet.create("jilebi");
		sweet.create("jangir");
		sweet.create("badursha");
		sweet.create("rasmalai");
		sweet.create("jamoon");
		sweet.create("kajukatli");
		sweet.create("soancake");
		sweet.create("burfi");
		sweet.create("halwa");
		//sweet.create("besanladoo");
		System.out.println(sweet.totalSweet());
		









	}

}
