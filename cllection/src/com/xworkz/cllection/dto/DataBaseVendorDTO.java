package com.xworkz.cllection.dto;

import java.io.Serializable;

public class DataBaseVendorDTO implements Serializable {

	
	private String type;
	private String devolopedBy;
	private double licenseCost;
	
	public DataBaseVendorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DataBaseVendorDTO(String type, String devolopedBy, double licenseCost) {
		super();
		this.type = type;
		this.devolopedBy = devolopedBy;
		this.licenseCost = licenseCost;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [type=" + type + ", devolopedBy=" + devolopedBy + ", licenseCost=" + licenseCost
				+ "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDevolopedBy() {
		return devolopedBy;
	}

	public void setDevolopedBy(String devolopedBy) {
		this.devolopedBy = devolopedBy;
	}

	public double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof DataBaseVendorDTO) {
				DataBaseVendorDTO dto=(DataBaseVendorDTO)obj;
				return true;
			}
		}
		
		return false;
	}
	
}
