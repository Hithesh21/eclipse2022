package com.xworkz.season.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	@Autowired
	private Area area;
	
public Location() {
	System.out.println("created no-args const of location.........");

}

@Override
public String toString() {
	return "Location [area=" + area + "]";
}

public Area getArea() {
	return area;
}

public void setArea(Area area) {
	this.area = area;
}

public void setArea(Class<Area> class1) {
	// TODO Auto-generated method stub
	
}	


}
