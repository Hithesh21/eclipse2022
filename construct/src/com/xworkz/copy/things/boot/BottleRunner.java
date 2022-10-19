package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Bottle;

public class BottleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] clr= {"blue","orange"};
		 String[] shp= {"round","square","hexagon"};
	     String[] mate= {"plastic","steel"};
	     String[] sz= {"500ml","750ml","1litre"};
	     int[] pri= {20,80,120};
	     Bottle bottle=new Bottle("cello","hot",5.8,0.4,true,clr,shp,mate,sz,pri);
	     bottle.show();
	}

}
