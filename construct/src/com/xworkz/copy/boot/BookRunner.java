package com.xworkz.copy.boot;

import com.xworkz.copy.things.Book;

public class BookRunner {

	public static void main(String[] args) {
		 String[] edition= {"1.1","1.2"};
		 String[] year= {"2020","2021","2022"};
	     String[] pages= {"350","400"};
	     int[] copies= {2000,3000,4000};
	     int[] price= {200,380,480};
     Book book=new Book("java","james",4.2,5.8,edition,year,pages,copies,price);
     book.show();
	}

}
