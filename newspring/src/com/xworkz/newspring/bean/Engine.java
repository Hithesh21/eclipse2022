package com.xworkz.newspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Engine {
	@Autowired
	@Qualifier("name1")

	private String name;
	@Autowired
	private String brand;
	@Autowired
	private String type;
	@Autowired
	private String mfrloc;
	@Autowired
	@Qualifier("owner1")

	private String owner;
	@Autowired
	private String officeAddress;
	@Autowired
	@Qualifier("id1")
	private int id;
	@Autowired
	@Qualifier("price1")
    private int price;
	
	private int bhp;
	private int version;
	private int noOfStaff;
	private String size;
	private String color;
	private String shape;
	private boolean quality;
	private boolean imported;
	@Override
	public String toString() {
		return "Engine [name=" + name + ", brand=" + brand + ", type=" + type + ", mfrloc=" + mfrloc + ", owner="
				+ owner + ", officeAddress=" + officeAddress + ", id=" + id + ", version=" + version + ", bhp=" + bhp
				+ ", price=" + price + ", noOfStaff=" + noOfStaff + ", size=" + size + ", color=" + color + ", shape="
				+ shape + ", quality=" + quality + ", imported=" + imported + "]";
	}
	public Engine(String name, String brand, String type, String mfrloc, String owner, String officeAddress, int id,
			int version, int bhp, int price, int noOfStaff, String size, String color, String shape, boolean quality,
			boolean imported) {
		super();
		this.name = name;
		this.brand = brand;
		this.type = type;
		this.mfrloc = mfrloc;
		this.owner = owner;
		this.officeAddress = officeAddress;
		this.id = id;
		this.version = version;
		this.bhp = bhp;
		this.price = price;
		this.noOfStaff = noOfStaff;
		this.size = size;
		this.color = color;
		this.shape = shape;
		this.quality = quality;
		this.imported = imported;
	}
	
	




	




}
