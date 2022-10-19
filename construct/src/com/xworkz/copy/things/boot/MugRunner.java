package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Jug;
import com.xworkz.copy.things.Mug;

public class MugRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] clr= {"blue","orange"};
		 String[] shp= {"round","square"};
	     String[] mate= {"plastic","steel"};
	     String[] sz= {"50ml","120ml","200ml"};
	     int[] pri= {20,80,120};
	     Mug mug=new Mug("milton","regular",5.8,0.4,clr,shp,mate,sz,pri);
	     mug.show();
	
	}

}
