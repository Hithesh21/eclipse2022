package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Bottle;
import com.xworkz.copy.things.Jug;

public class JugRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] clr= {"blue","orange"};
		 String[] shp= {"round","square","hexagon"};
	     String[] mate= {"plastic","steel"};
	     String[] sz= {"500ml","750ml","1litre"};
	     int[] pri= {20,80,120};
	     Jug jug=new Jug("cello","hot",5.8,0.4,clr,shp,mate,sz,pri);
	     jug.show();
	
	}

}
