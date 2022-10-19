package com.xworkz.copy.things;

public class Mug {

	public String brand;
	public String type;
	public double height;
	public double weight;
	
	public String[] color;
	public String[] size;
	public String[] shape;
	public String[] materials;
	public int[] price;
	public Mug(String brand, String type, double height, double weight, String[] color, String[] size, String[] shape,
			String[] materials, int[] price) {
		this.brand = brand;
		this.type = type;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.size = size;
		this.shape = shape;
		this.materials = materials;
		this.price = price;
	}
	public void show() {
		System.out.println(this.brand);
		System.out.println(this.type);
		System.out.println(this.height);
		System.out.println(this.weight);
		System.out.println(this.color);
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		System.out.println(this.size);
		for (int i = 0; i < size.length; i++) {
			System.out.println(this.size[i]);
		}
		System.out.println(this.shape);
		for (int i = 0; i < shape.length; i++) {
			System.out.println(this.shape[i]);
		}
		System.out.println(this.materials);
		for (int i = 0; i < materials.length; i++) {
			System.out.println(this.materials[i]);
		}
		System.out.println(this.price);
		for (int i = 0; i < price.length; i++) {
			System.out.println(this.price[i]);
		}
	}
	
}
