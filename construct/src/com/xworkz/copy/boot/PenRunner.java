package com.xworkz.copy.boot;

import com.xworkz.copy.Pen;

public class PenRunner {

	public static void main(String[] args) {
		 String[] temp= {"brown","yellow"};
		 char[] value= {'s','m','b'};
		String[] ty= {"ball" ,"ink","gel"};
		String[] loc= {"blr" ,"hubli","tumkur"};
		int[] rate= {20,30,40,50};
		String[] mate= {"plastic" ,"metal"};
		int[] len= {4,5,6};
Pen pen=new Pen(true, true, true, true, "cello", 50, temp, value, ty, len, loc, rate, mate);
pen.display();
	}

}
;