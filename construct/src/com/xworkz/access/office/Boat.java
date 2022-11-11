package com.xworkz.access.office;

public class Boat {
	private String name;
	public String color;
	
	public String CompanyOwner;
	public char type;
	public String ownerWife;
	public boolean isSail;
	
	public Boat(String color, String companyOwner, char type, String owner, boolean isSail) {
		super();
		this.color = color;
		CompanyOwner = companyOwner;
		this.type = type;
		this.ownerWife = owner;
		this.isSail = isSail;
	}
	void setName(String name) {
		  this.name=name;
	  }
	  public String getName() {
		  return name;
	  }
}
