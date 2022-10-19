package com.xworkz.copy.boot;

import com.xworkz.copy.Samosa;

public class SamosaRunner {

	public static void main(String[] args) {
		 String[] temp= {"brown","yellow"};
		 char[] value= {'t','r'};
		String[] in= {"flour" ,"spices","veggies"};
		String[] loc= {"blr" ,"hubli","tumkur"};
		int[] rate= {20,30,40,50};
		String[] sz= {"small" ,"med","big"};
		System.out.println("runner of samosa");
		Samosa samosa=new Samosa("abc",temp,value, 2, in,sz, true, true, loc, true, rate);
		samosa.display();
		
	}

}
