package com.xworkz.association.things;

public class Temple {
	public String name;
	public int noOfVisitor;
	public String mainPriest;
    public God god=new God("saraswathi", "f", "vidya");
	public Temple(String name, int noOfVisitor, String mainPriest) {
		super();
		this.name = name;
		this.noOfVisitor = noOfVisitor;
		this.mainPriest = mainPriest;
	}

    
	public void show() {
		System.out.println("entered show of temple");
		System.out.println("name :"+name);
		System.out.println("total visitor :"+noOfVisitor);
		System.out.println("priest :"+mainPriest);
		god.show();
	}
}
