package com.xworkz.copy;

public class Box {
	public String name;
	public String color;
	public String size;
	public int[] weight;
	public int[] price;
	public String[] shapes;
	public String[] types;
	public String[] materials;
	
	public Box(String name,String color,String size,int[] weight,
			 int[] price, String[] shapes,String[] types,String[] materials) {
		this.color=color;
		this.materials=materials;
		this.name=name;
		this.size=size;
		this.shapes=shapes;
		this.types=types;
		this.weight=weight;
		this.price=price;
		
	}
	public void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(size);
		System.out.println(weight);
		for (int i = 0; i < weight.length; i++) {
			int string = weight[i];
			System.out.println(string);
		
		}
		System.out.println(price);
		for (int i = 0; i < price.length; i++) {
			int string = price[i];
			System.out.println(string);
		}
		System.out.println(shapes);
		for (int i = 0; i < shapes.length; i++) {
			String string = shapes[i];
			System.out.println(string);
		}
		System.out.println(types);
		for (int i = 0; i < types.length; i++) {
			String string = types[i];
			System.out.println(string);
		}
		System.out.println(materials);
		for (int i = 0; i < materials.length; i++) {
			String string = materials[i];
			System.out.println(string);
		}
	}

}
