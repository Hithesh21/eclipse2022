package com.xworkz.inheritance.hotel.boot;

import com.xworkz.equality.Currency;
import com.xworkz.equality.Institution;
import com.xworkz.equality.Lipstick;
import com.xworkz.equality.Paint;
import com.xworkz.equality.Vehicle;
import com.xworkz.equality.WaterBottle;

public class PaintRunner {

	public static void main(String[] args) {
		
		Paint paint=new Paint("asian","royal","s","blr","hithesh","orange",500,1.0,true,true);
		System.out.println(paint);
		Paint paint1=new Paint("asian","royal","s","blr","hithesh","orange",300,1.0,true,true);
		System.out.println(paint1);
		boolean same=paint.equals(paint1);
		System.out.println(same);

		System.out.println("============vehicle=========");

		Vehicle vehicle = new Vehicle("maruti", "brezza", "sedan", "blr", "hithesh", "blue", 100000, 1500, true, true);
		System.out.println(vehicle);
		Vehicle vehicle1 = new Vehicle("Maruti", "Brezza", "sedan", "blr", "hithesh", "blue", 100000, 1500, true, true);
		System.out.println(vehicle1);
		boolean same1 = vehicle.equals(vehicle1);
		System.out.println(same1);

		System.out.println("=====================waterbottle==========================");
        WaterBottle water=new WaterBottle("bisleri", "plastic", "small", "blr", "kohli", "white", 20, 1, true, true);
        System.out.println(water);
        WaterBottle water1=new WaterBottle("patanjali", "plastic", "med", "blr", "kohli", "white", 20, 1, true, true);
        System.out.println(water1);
        boolean same2=water.equals(water1);
        System.out.println(same2);
        
		System.out.println("=====================currency==========================");
		Currency cur=new Currency("rupee", "india", "note", "rbi", 2000, "green", 20, 2022, true, true);
		System.out.println(cur);
        
		Currency cur1=new Currency("euro", "france", "note", "fbi", 200, "green", 20, 2022, true, true);
				System.out.println(cur1);
        boolean same3=cur.equals(cur1);
        System.out.println(same3);
				
        System.out.println("=====================institution==========================");		
        Institution ins=new Institution("xworkz", "rjn", "om", "java", "om", "akshara", 200000, 5, true, true);		
		System.out.println(ins);		
				
        Institution ins1=new Institution("xworkz", "rjn", "om", "java", "om", "akshara", 200000, 5, true, true);		
        System.out.println(ins1);
        boolean same4=ins.equals(ins1);
        System.out.println(same4);

        System.out.println("=====================lipstick==========================");	
        Lipstick lip=new Lipstick("lakme", "best", "rollon", "choco", "rashmika", "brown", 200, 5, true, true);	
		System.out.println(lip);		
        Lipstick lip1=new Lipstick("loreal", "super", "rollon", "orange", "preeti zinta", "orange", 200, 5, true, true);
        System.out.println(lip1);
        boolean same5=lip.equals(lip1);
        System.out.println(same5);
	}

}
