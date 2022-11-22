package com.xworkz.equality;

public class Currency {
	private String name;
	private String country;
	private String type;
	private String regulatory;
	private int highestDenomination;
	private String color;
	private int noOfDenomination;
	private double year;
	private boolean value;
	private boolean demonitize;
	
	
	public Currency() {
		
	}


	public Currency(String name, String country, String type, String regulatory, int highestDenomination, String color,
			int noOfDenomination, double year, boolean value, boolean demonitize) {
		super();
		this.name = name;
		this.country = country;
		this.type = type;
		this.regulatory = regulatory;
		this.highestDenomination = highestDenomination;
		this.color = color;
		this.noOfDenomination = noOfDenomination;
		this.year = year;
		this.value = value;
		this.demonitize = demonitize;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getRegulatory() {
		return regulatory;
	}


	public void setRegulatory(String regulatory) {
		this.regulatory = regulatory;
	}


	public int getHighestDenomination() {
		return highestDenomination;
	}


	public void setHighestDenomination(int highestDenomination) {
		this.highestDenomination = highestDenomination;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNoOfDenomination() {
		return noOfDenomination;
	}


	public void setNoOfDenomination(int noOfDenomination) {
		this.noOfDenomination = noOfDenomination;
	}


	public double getYear() {
		return year;
	}


	public void setYear(double year) {
		this.year = year;
	}


	public boolean isValue() {
		return value;
	}


	public void setValue(boolean value) {
		this.value = value;
	}


	public boolean isDemonitize() {
		return demonitize;
	}


	public void setDemonitize(boolean demonitize) {
		this.demonitize = demonitize;
	}


	@Override
	public String toString() {
		return "Currency [name=" + name + ", country=" + country + ", type=" + type + ", regulatory=" + regulatory
				+ ", highestDenomination=" + highestDenomination + ", color=" + color + ", noOfDenomination="
				+ noOfDenomination + ", year=" + year + ", value=" + value + ", demonitize=" + demonitize + "]";
	}
	
	public boolean equals(Object other) {
		System.out.println("entered equal method");
		if(other instanceof Currency) {
			System.out.println("other is type of currency");
			Currency casted=(Currency)other;
			if(this.name.equals(casted.name) && this.country.equals(casted.country) && this.type.equals(casted.type)
					&& this.regulatory.equals(casted.regulatory)) {
				System.out.println("same in name,country,type,regulatory");
			}
			else {
				System.err.println("other is not same, cant check properties");
			}
		}
		
	return false;
	}
}
