package com.xworkz.inheritance.hotel.boot;



public class StringRunner {
	
	public static void main(String[] args) {
		
		String place;
		place = "Silicon valley";
		String cat = place.concat(" of india");
		System.out.println(place);
		System.out.println(cat);
		char cat1 = place.charAt(1);
		System.out.println(cat1);
		int cat2 = cat.length();
		System.out.println(cat2);
		int code = place.hashCode();
		System.out.println(code);
		String up = place.toUpperCase();
		System.out.println(up);
		String str = cat.toString();
		System.out.println(cat);
		String place1 = "BANGALORE";
		String low = place1.toLowerCase();
		System.out.println(low);
		int compare = place.compareTo(place1);
		System.out.println(compare);
		boolean check=place.contentEquals(place1);
		System.out.println(check);
		String place2="BANGALOREONE";
		boolean check1=place2.contentEquals(place1);
		System.out.println(check1);
		int compare1=place1.compareToIgnoreCase(place2);
		System.out.println(compare1);
		int index=place.indexOf("l");
		System.out.println(index);
		System.out.println(place2.indexOf("O", 8));
		System.out.println(place2.indexOf("ONE", 8));
		System.out.println(place2.startsWith("BAN"));
		System.out.println(place2.endsWith("BAN"));
		System.out.println(place2.substring(5));
		System.out.println(place2.substring(2, 11));
		System.out.println(place2.substring(5));
		System.out.println(place2.substring(5));
		System.out.println(place2.substring(5));
		System.out.println(place2.replace("ONE", "TWO"));
		System.out.println(place2.replace("ONE", "one"));
		System.out.println(place.trim());
		System.out.println(place2.equals("BANGALOREONE"));
		System.out.println(place.equalsIgnoreCase(place));
		System.out.println("string  \n escape sequence \n in line");
		System.out.println("string \t escape sequence in line for tab space");
		System.out.println(place.compareTo("Bangaore"));
		System.out.println(place1.compareToIgnoreCase("BANGALORE"));
		System.out.println(place.compareTo("Bangaore"));
		System.out.println(place.compareTo("Bangaore"));
        System.out.println(place.matches("Silicon valley"));
        System.out.println(place1.matches("bangalore"));
        System.out.println(place1.contains("N"));
        System.out.println(place.isEmpty());
        System.out.println(place1.codePointAt(3));



        

	}

}
