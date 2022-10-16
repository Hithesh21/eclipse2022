package com.xworkz.copy;

public class TextileShop {
	public String ownerName;
	public String ownerWifeName;
	public int shopNo;
	public String ownerDaughterName;
    public long mobileNo;
	public String shopName;
    
   public TextileShop()
		
	 {
		System.out.println("default contr ");
		
	}
   
   public TextileShop(String ownerName) {
		this();
		System.out.println(" contr with one string args");
       this.ownerName=ownerName;
		}
   
   public TextileShop(String ownerName,String ownerWifeName) {
		this(ownerName);
		System.out.println(" contr with 2 string args");
       this.ownerWifeName=ownerWifeName;
		}
   public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName) {
 		this(ownerName,ownerWifeName);
 		System.out.println(" contr with 3 string args");
        this.ownerDaughterName=ownerDaughterName;
   }
   public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,String shopName) {
		this(ownerName,ownerWifeName,ownerDaughterName);
		System.out.println(" contr with 4 string args");
       this.shopName=shopName;
  }   
   public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,String shopName,int mobileNo) {
		this(ownerName,ownerWifeName,ownerDaughterName,shopName);
		System.out.println(" contr with 4 string args and int type");
      this.mobileNo=mobileNo;
 } 
   public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,String shopName,int mobileNo,int shopNo) {
		this(ownerName,ownerWifeName,ownerDaughterName,shopName,mobileNo);
		System.out.println(" contr with 4 string args and 2 int type");
     this.shopNo=shopNo;
}  public TextileShop(int shopNo,int mobileNo,String shopName) {
	this();
		System.out.println(" contr with 2 int args and 1 string type");
    this.shopNo=shopNo;
    this.mobileNo=mobileNo;
    this.shopName=shopName;
}
}
