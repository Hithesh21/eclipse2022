package com.xworkz.cllection.dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {

	
	private String name;
	private String devolopedBy;
	private int version;
	private double price;
	private boolean free;
	
      public ApplicationDTO() {
	// TODO Auto-generated constructor stub
}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", devolopedBy=" + devolopedBy + ", version=" + version + ", price="
				+ price + ", free=" + free + "]";
	}

	public ApplicationDTO(String name, String devolopedBy, int version, double price, boolean free) {
		super();
		this.name = name;
		this.devolopedBy = devolopedBy;
		this.version = version;
		this.price = price;
		this.free = free;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevolopedBy() {
		return devolopedBy;
	}

	public void setDevolopedBy(String devolopedBy) {
		this.devolopedBy = devolopedBy;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}	
      
      @Override
    public boolean equals(Object obj) {
    	  if(obj!=null) {
    		  if(obj instanceof ApplicationDTO) {
    			  ApplicationDTO dto=(ApplicationDTO)obj;
    			  return true;
    		  }
    	  }
    	return false;
    }
}
