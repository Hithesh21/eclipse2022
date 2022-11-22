package com.xworkz.equality;

public class Lipstick {
	
	private String brand;
	private String name;
	private String type;
	private String flavour;
	private String ambassador;
	private String color;
	private int price;
	private int qty;
	private boolean quality;
	private boolean withBox;
	
	public Lipstick() {
		
	}

	public Lipstick(String brand, String name, String type, String flavour, String ambassador, String color, int price,
			int qty, boolean quality, boolean withBox) {
		super();
		this.brand = brand;
		this.name = name;
		this.type = type;
		this.flavour = flavour;
		this.ambassador = ambassador;
		this.color = color;
		this.price = price;
		this.qty = qty;
		this.quality = quality;
		this.withBox = withBox;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public boolean isWithBox() {
		return withBox;
	}

	public void setWithBox(boolean withBox) {
		this.withBox = withBox;
	}

	@Override
	public String toString() {
		return "Lipstick [brand=" + brand + ", name=" + name + ", type=" + type + ", flavour=" + flavour
				+ ", ambassador=" + ambassador + ", color=" + color + ", price=" + price + ", qty=" + qty + ", quality="
				+ quality + ", withBox=" + withBox + "]";
	}
	public boolean equals(Object other) {
		System.out.println("entered equal method");
		if(other instanceof Lipstick) {
			System.out.println("other is type of lipstick");
			Lipstick casted=(Lipstick)other;
			if(this.brand.equals(casted.brand) && this.name.equals(casted.name) && this.type.equals(casted.type)
					&& this.flavour.equals(casted.flavour) && this.ambassador.equals(casted.ambassador) 
					&& this.color.equals(casted.color)) {
				System.out.println("same in brand,name,type,flavour,ambassador,color");
			}
			else {
				System.err.println("other is not same, cant check properties");
			}
		}
		
	return false;
	}
}
