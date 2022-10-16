package com.xworkz.copy;

public class Boat {
	public String name;
	public String color;
	
	public String CompanyOwner;
	public char type;
	public String owner;
	
	public Boat() {
		System.out.println("entered default constructor");
	}
    public Boat(String name,String color )
    {
    	System.out.println("=========entered parameter constructor with 2 string args=========");
    	this.name=name;
    	this.color=color;
    }
    public Boat(String CompanyOwner,char type)
    {
    	System.out.println("==========entered parameter constructor with 2 string and char args=========");
    	this.CompanyOwner=CompanyOwner;
    	this.type=type;
    }
    public Boat(String owner,String name, char type)
    {
    	System.out.println("===============entered parameter constructor with 3 args============");
    	this.owner=owner;
    	this.name=name;
    	this.type=type;
    }
    public Boat(String owner)
    {
    	System.out.println("=============entered parameter constructor with 1 args================");
    	this.owner=owner;
    }
    public Boat(String owner,String name,String CompanyOwner, char type) {
    	System.out.println("=================entered parameter constructor with 4 args===============");
    	this.owner=owner;
    	this.CompanyOwner=CompanyOwner;
    	this.name=name;
    	this.type=type;
    	
    }
}
