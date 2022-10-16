package com.xworkz.copy;

public class Bread {
public char	type;
public String	shape;
public int price;
public int	quantity;
public		  String	companyName;
public Bread() {
	System.out.println("entered default constructor");
}
public Bread(String companyName )
{
	
	System.out.println("=========entered parameter constructor with 1 string args=========");
	this.companyName=companyName;
	
}
public Bread(char type )
{
	System.out.println("=========entered parameter constructor with 1 char args=========");
	this.type=type;
	
}
public Bread(int price )
{
	System.out.println("=========entered parameter constructor with 1 int args=========");
	this.price=price;
	
}
public Bread(int price,int quantity )
{
	System.out.println("=========entered parameter constructor with 2 int args=========");
	this.price=price;
	this.quantity=quantity;
}
public Bread(String shape,int quantity )
{
	System.out.println("=========entered parameter constructor with 2 int args=========");
	this.shape=shape;
	this.quantity=quantity;
}
public Bread(int price,int quantity,String shape )
{
	System.out.println("=========entered parameter constructor with 3  args=========");
	this.price=price;
	this.quantity=quantity;
	this.shape=shape;
}
public Bread(int price,int quantity,char type )
{
	System.out.println("=========entered parameter constructor with 3  args=========");
	this.price=price;
	this.quantity=quantity;
	this.type=type;
}
public Bread(int price,int quantity,char type,String shape )
{
	System.out.println("=========entered parameter constructor with 4  args=========");
	this.price=price;
	this.quantity=quantity;
	this.type=type;
	this.shape=shape;
}
public Bread(int price,int quantity,char type,String shape,String companyName )
{
	System.out.println("=========entered parameter constructor with 5  args=========");
	this.price=price;
	this.quantity=quantity;
	this.type=type;
	this.shape=shape;
	this.companyName=companyName;
}
}
