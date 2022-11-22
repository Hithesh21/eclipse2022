package com.xworkz.equality;

public class Paint {
	
	private String brand;
	private String name;
	private String size;
	private String mfrLoc;
	private String ambassador;
	private String color;
	private int price;
	private double weight;
	private boolean withBox;
	private boolean quality;
	
	public Paint() {
		System.out.println("default of paint");
	}
	
	public Paint(String brand, String name, String size, String mfrLoc, String ambassador, String color, int price,
			double weight, boolean withBox, boolean quality) {
		super();
		this.brand = brand;
		this.name = name;
		this.size = size;
		this.mfrLoc = mfrLoc;
		this.ambassador = ambassador;
		this.color = color;
		this.price = price;
		this.weight = weight;
		this.withBox = withBox;
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", name=" + name + ", size=" + size + ", mfrLoc=" + mfrLoc + ", ambassador="
				+ ambassador + ", color=" + color + ", price=" + price + ", weight=" + weight + ", withBox=" + withBox
				+ ", quality=" + quality + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMfrLoc() {
		return mfrLoc;
	}

	public void setMfrLoc(String mfrLoc) {
		this.mfrLoc = mfrLoc;
	}

	public String getAmbassador() {
		return ambassador;
	}

	public void setAmbassador(String ambassador) {
		this.ambassador = ambassador;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isWithBox() {
		return withBox;
	}

	public void setWithBox(boolean withBox) {
		this.withBox = withBox;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}
	
	@Override
	public boolean equals(Object other) {
		System.out.println("entered equals method");
		if(other instanceof Paint) {
			System.out.println("other is paint , can check properties");
			Paint casted=(Paint)other;
			if(this.brand.equals(casted.brand)) {
				System.out.println("brand is same");
				return true;
			}
			else {
				System.err.println("other is not paint, cannot check properties");
			}
		}
			
			
		return false;
		
	}
	
	
	
	
	

}
