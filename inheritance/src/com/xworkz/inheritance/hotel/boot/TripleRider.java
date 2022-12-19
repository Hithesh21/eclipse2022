package com.xworkz.inheritance.hotel.boot;

public class TripleRider {

	public static void main(String[] args) {
		String trippleRide = "Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println(trippleRide.length());
		
		System.out.println("(==========================Split ====================");
		String[] splitstament = trippleRide.split(",");
		for (int i = 0; i < splitstament.length; i++) {
			System.out.println(splitstament[i]);
		}
		System.out.println(splitstament.length);
		System.out.println(System.lineSeparator());
		System.out.println("==================Split all by space================== ");
		String[] splitstament1 = trippleRide.split(" ");
		for (int i = 0; i < splitstament1.length; i++) {
			System.out.println(splitstament1[i]);
		}
		System.out.println(splitstament1.length);
		System.out.println(System.lineSeparator());
		
		System.out.println("====================Upper case===========================");
		String upper = trippleRide.toUpperCase();
		System.out.println(upper);
		System.out.println(System.lineSeparator());
		
		System.out.println("====================Lower case=============================");
		String lower = trippleRide.toLowerCase();
		System.out.println(lower);
		System.out.println(System.lineSeparator());
		
		System.out.println("================== Convert above string to char []==================== ");
		char[] array = trippleRide.toCharArray();
		for (int n = 0; n < array.length; n++) {
			System.out.print(array[n]);
		}
		System.out.println(System.lineSeparator());
		
		System.out.println("===================Reverse above string by using for loop=============== ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);

		}
		
}}
