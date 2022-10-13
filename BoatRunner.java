package com.xworkz.copy.boot;
import com.xworkz.copy.*;
public class BoatRunner {

	public static void main(String[] args) {
		System.out.println("runner started");
		
		Boat boat=new Boat();
		System.out.println(boat.name);
		System.out.println(boat.color);
		System.out.println(boat.CompanyOwner);
		System.out.println(boat.type +"space");
		System.out.println(boat.owner);
		Boat boat1=new Boat("cordelia","blue");
		System.out.println(boat1.name);
		System.out.println(boat1.color);
		System.out.println(boat1.CompanyOwner);
		System.out.println(boat1.type +"space");
		System.out.println(boat1.owner);
		boat1.CompanyOwner="indian";
		boat1.type='l';
		boat1.owner="abc";
		System.out.println(boat1.name);
		System.out.println(boat1.color);
		System.out.println(boat1.CompanyOwner);
		System.out.println(boat1.type +"space");
		System.out.println(boat1.owner);
		
		boat1.type='e';
		boat1.owner="abc1";
		
		System.out.println(boat1.name);
		System.out.println(boat1.color);
		System.out.println(boat1.CompanyOwner);
		System.out.println(boat1.type +"space");
		System.out.println(boat1.owner);
		
		Boat boat2=new Boat("bharat",'b');
		System.out.println(boat2.name);
		System.out.println(boat2.color);
		System.out.println(boat2.CompanyOwner);
		System.out.println(boat2.type );
		System.out.println(boat2.owner);
		boat2.type='e';
		boat2.owner="abc1";
		System.out.println(boat2.type );
		System.out.println(boat2.owner);
		
		Boat boat3=new Boat("bharat");
		System.out.println(boat3.name);
		System.out.println(boat3.color);
		System.out.println(boat3.CompanyOwner);
		System.out.println(boat3.type +"space");
		System.out.println(boat3.owner);
		boat3.name="star";
		boat3.color="blue";
		boat3.type='l';
		boat3.owner="singh";
		System.out.println(boat3.name);
		System.out.println(boat3.color);
		System.out.println(boat3.CompanyOwner);
		System.out.println(boat3.type +"space");
		System.out.println(boat3.owner);
		
		Boat boat4=new Boat("singh","cordellia",'e');
		System.out.println(boat4.name);
		System.out.println(boat4.color);
		System.out.println(boat4.CompanyOwner);
		System.out.println(boat4.type );
		System.out.println(boat4.owner);
		boat4.CompanyOwner="indian";
		boat4.color="blue";
		System.out.println("Company owner init : "  + boat4.CompanyOwner);
		System.out.println("color init :"+boat4.color);
		
		Boat boat5=new Boat("singh","cordellia","indian",'e');
		System.out.println(boat5.name);
		System.out.println(boat5.color);
		System.out.println(boat5.CompanyOwner);
		System.out.println(boat5.type );
		System.out.println(boat5.owner);
		boat5.color="blue";
		System.out.println("color init :"+boat5.color);
		
	
	}

}
