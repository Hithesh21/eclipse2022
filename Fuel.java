package com.xworkz.association.things;

public class Fuel {
       public double price;
       public double qty;
       public boolean special=true;
       public Type type=Type.PETROL;
       public Brand brand=new Brand("bharat"," 29ka123456890", "5*");
	   
      public Fuel(double price, double qty, boolean special) {
		super();
		this.price = price;
		this.qty = qty;
		this.special = special;
		
	}

      public double totalPrice(double price,double qty) {
    	  double total=price*qty;
    	  System.out.println("total price :"+total);
		return total;
      }
      public void show() {
    	  
    	  System.out.println("running show of fuel");
    		System.out.println("price :"+price);
    		System.out.println("qty :"+qty);
    		System.out.println("special :"+special);
    	  System.out.println("type :"+type);
    	  brand.show();
    	  totalPrice(102, 20);
      }
      
}
