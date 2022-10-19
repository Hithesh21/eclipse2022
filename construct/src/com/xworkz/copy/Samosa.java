package com.xworkz.copy;

public class Samosa {
	public String name;
	public String[] color;
	public char[]  shape;
	public int weight;
	public String[] size;
	public String[] ingredient;
	public boolean fried;
	public boolean taste;
	public String[] location;
	public boolean baked;
	public int price[];
	
	public Samosa(String name,String[] color,char[]  shape,int weight,String[] size,String[] ingredient,
			boolean fried,boolean taste,String[] location,boolean baked,int price[]) {
		System.out.println("entered constructor");
		this.baked=baked;
		this.color=color;
		this.fried=fried;
		this.name=name;
		this.ingredient=ingredient;
		this.price=price;
		this.shape=shape;
		this.size=size;
		this.taste=taste;
		this.weight=weight;
		this.location=location;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(weight);
		System.out.println(baked);
		System.out.println(fried);
		System.out.println(taste);
		System.out.println(color);
		for (int i = 0; i < color.length; i++) {
			String ref=color[i];
			System.out.println(ref);
			}
		System.out.println(size);
		for (int i = 0; i < size.length; i++) {
			String string = size[i];
			System.out.println(string);
		}
		System.out.println(shape);
		for (int i = 0; i < shape.length; i++) {
			char string = shape[i];
			System.out.println(string);
		}
		System.out.println(ingredient);
		for (int i = 0; i < ingredient.length; i++) {
			String string = ingredient[i];
			System.out.println(string);
		}
		System.out.println(price);
		for (int i = 0; i < price.length; i++) {
			int string = price[i];
			System.out.println(string);
		}
		System.out.println(location);
		for (int i = 0; i < location.length; i++) {
			String string = location[i];
			System.out.println(string);
		}
	}
	
			
	
}
