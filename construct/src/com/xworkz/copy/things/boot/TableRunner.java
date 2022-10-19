package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Table;

public class TableRunner {

	public static void main(String[] args) {
		 String[] shapes= {"square","rectangle"};
		 String[] size= {"small","medium","big"};
	     String[] material= {"plastic","plywood"};
	     String[] color= {"brown","ivory","maroon"};
	     int[] price= {2000,3800,4800};
	     Table table=new Table("supreme","blr",2.4,5.2,shapes,size,material,color,price);
	     table.show();
	}

}
