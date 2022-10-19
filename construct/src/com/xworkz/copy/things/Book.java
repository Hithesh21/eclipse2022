package com.xworkz.copy.things;

public class Book {
	public String name;
	public String author;
	public double height;
	public double width;
	public String[] edition;
	public String[] year;
	public String[] pages;
	public int[] copies;
	public int[] price;
	
	public Book(String name, String author, double height, double width, String[] edition, String[] year,
			String[] pages, int[] copies, int[] price) {
	
		this.name = name;
		this.author = author;
		this.height = height;
		this.width = width;
		this.edition = edition;
		this.year = year;
		this.pages = pages;
		this.copies = copies;
		this.price = price;
	}
	
	public void show() {
		System.out.println(this.name);
		System.out.println(this.author);
		System.out.println(this.height);
		System.out.println(this.width);
		System.out.println(this.edition);
		for (int i = 0; i <edition.length; i++) {
			String string = edition[i];
			System.out.println(string);
		}
		
		System.out.println(this.year);
		for (int i = 0; i <year.length; i++) {
			System.out.println(this.year[i]);
		}
		
		System.out.println(this.pages);
		for (int i = 0; i < pages.length; i++) {
			System.out.println(this.pages[i]);
		}
		
		System.out.println(this.copies);
		for (int i = 0; i < copies.length; i++) {
			System.out.println(this.copies[i]);
		}
		
		System.out.println(this.price);
		for (int i = 0; i < price.length; i++) {
			System.out.println(this.price[i]);
		}
	}

}
