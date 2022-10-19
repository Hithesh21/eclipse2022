package com.xworkz.copy;

public class Pen {
	public String brand;
	public String[] color;
	public char[]  size;
	public int weight;
	public String[] type ;
	public int[] length;
	public boolean isWriting;
	public boolean pocketHold;
	public String[] mfrsloc;
	public boolean withBox ;
	public int price[];
	public String[] materials ;
	public boolean withCap;
	
	public Pen(boolean isWriting,boolean pocketHold,boolean withBox,boolean withCap,String brand,
			int weight,String[] color,char[]  size,String[] type,int[] length,String[] mfrsloc,
			int price[],String[] materials) {
		this.brand=brand;
		this.color=color;
		this.isWriting=isWriting;
		this.length=length;
		this.materials=materials;
		this.mfrsloc=mfrsloc;
		this.pocketHold=pocketHold;
		this.price=price;
		this.size=size;
		this.type=type;
		this.weight=weight;
		this.withBox=withBox;
		this.withCap=withCap;
	
	}
	public void display() {
		System.out.println(brand);
		System.out.println(weight);
		System.out.println(isWriting);
		System.out.println(withBox);
		System.out.println(withCap);
		System.out.println(color);
		for (int i = 0; i < color.length; i++) {
			String ref=color[i];
			System.out.println(ref);
			}
		System.out.println(type);
		for (int i = 0; i < type.length; i++) {
			String string = type[i];
			System.out.println(string);
		}
		System.out.println(mfrsloc);
		for (int i = 0; i < mfrsloc.length; i++) {
			String string = mfrsloc[i];
			System.out.println(string);
		}
		System.out.println(materials);
		for (int i = 0; i < materials.length; i++) {
			String string = materials[i];
			System.out.println(string);
		}
		System.out.println(size);
		for (int i = 0; i < size.length; i++) {
			char string = size[i];
			System.out.println(string);
		}
		System.out.println(price);
		for (int i = 0; i < price.length; i++) {
			int string = price[i];
			System.out.println(string);
		}
		System.out.println(length);
		for (int i = 0; i < length.length; i++) {
			int string = length[i];
			System.out.println(string);
		}
		
	}
}

















