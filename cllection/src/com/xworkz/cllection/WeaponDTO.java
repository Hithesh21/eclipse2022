package com.xworkz.cllection;

import java.io.Serializable;

public class WeaponDTO implements Serializable,Comparable<WeaponDTO> {
	
	private String name;
	private String madeOn;
	private String madeBy;
	private String type;
	private int price;
	
	public WeaponDTO() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDTO(String name, String madeOn, String madeBy, String type, int price) {
		super();
		this.name = name;
		this.madeOn = madeOn;
		this.madeBy = madeBy;
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeOn=" + madeOn + ", madeBy=" + madeBy + ", type=" + type + ", price="
				+ price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WeaponDTO) {
				WeaponDTO dto=(WeaponDTO)obj;
				if(dto.name.equals(this.name)) 
    			{
    				return true;
    			}
				
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 22;
	}
	
	public int compareTo(WeaponDTO o) {
		return o.name.compareTo(this.name);
		//return o.madeBy.compareTo(this.madeBy);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
