package com.xworkz.access.office;

public class TextileShop {
	public String ownerName;
	public String ownerWifeName;
	private String shopName="om tex";
	public String ownerDaughterName;
	public int shopNo;
    public int mobileNo;
	
    public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, int shopNo, int mobileNo) {
		super();
		this.ownerName = ownerName;
		this.ownerWifeName = ownerWifeName;
		this.ownerDaughterName = ownerDaughterName;
		this.shopNo = shopNo;
		this.mobileNo = mobileNo;
	}
	void setShopName(String shopName) {
		this.shopName=shopName;
	}
	public String getShopName() {
		return shopName;
	}
}
