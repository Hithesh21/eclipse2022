package com.xworkz.inheritance.hotel.boot;

import com.xworkz.inheritance.hotel.*;
import com.xworkz.inheritance.hotel.City;
import com.xworkz.inheritance.hotel.MetroCity;
import com.xworkz.inheritance.hotel.Place;
import com.xworkz.inheritance.hotel.SiliconCity;

public class BengaluruRunner {

	public static void main(String[] args) {
		Bengaluru bengaluru=new Bengaluru();
		System.out.println("=========================1");
     
		Bengaluru bengaluru2 = new SiliconCity();
		System.out.println("=========================2");
		Bengaluru bengaluru3 = new MetroCity();
		System.out.println("=========================3");
		Bengaluru bengaluru4 = new City();
		System.out.println("=========================4");
		Bengaluru bengaluru5 = new Capital();
		System.out.println("=========================5");
		Bengaluru bengaluru6 = new Place();
		System.out.println("=========================6");
         Object object=new Bengaluru();
         System.out.println("=========================7");
         SiliconCity siliconCity=new SiliconCity();
         System.out.println("=========================8");
         SiliconCity siliconCity1=new MetroCity();
         System.out.println("=========================8");
         SiliconCity siliconCity2=new City();
         System.out.println("=========================9");
         SiliconCity siliconCity3=new Capital();
         System.out.println("=========================10");
         SiliconCity siliconCity4=new Place();
         System.out.println("=========================11");
         MetroCity metroCity=new MetroCity();
         System.out.println("=========================12");
         MetroCity metroCity1=new City();
         System.out.println("=========================13");
         MetroCity metroCity2=new Capital();
         System.out.println("=========================14");
         MetroCity metroCity3=new Place();
         System.out.println("=========================15");
         City city=new City();
        		 
         System.out.println("=========================16");
         City city1=new Capital();
         System.out.println("=========================17");
         City city2=new Place();
         System.out.println("=========================18");
         Capital capital=new Capital();
         System.out.println("=========================19");
         Capital capital1=new Place();
         System.out.println("=========================20");
         Place place=new Place();
         System.out.println("=========================21");
         Object place1=new Object();
	}

}
