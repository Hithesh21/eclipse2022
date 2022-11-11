package com.xworkz.inheritance.hotel.boot;

import com.xworkz.inheritance.hotel.things.Events;
import com.xworkz.inheritance.hotel.things.Marriage;

public class MarriageRunner {

	public static void main(String[] args) {
		Marriage marriage=new Marriage();
		Events events=new Events("mamatha","om","blr");
		System.out.println(events.brideName);
		System.out.println(events.groomName);
		System.out.println(events.location         );
		System.out.println(events.djName);
		System.out.println(events.noOfPeople);
		Events event=new Events("abc","ten");
		System.out.println(event.djName);
		System.out.println(event.noOfPeople);
	}

}
