package com.xworkz.inheritance.hotel.things;

import com.xworkz.inheritance.hotel.ShoppingMall;

public class OrionMall extends ShoppingMall {
public int area;

public OrionMall() {
	// TODO Auto-generated constructor stub
}

public OrionMall(String name, String loc,int area) {
      super(name,loc);
      this.area=area;
	
}
public void show() {
	super.show();
	System.out.println("area :"+area);
}


}
