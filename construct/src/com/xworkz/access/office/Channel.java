package com.xworkz.access.office;

public class Channel {
	
		private String name="tv9";
		public String editor;
		public String owner;
		public int income;
		public int pincode;
		public String anchorNames;
		public String reportersNames;
		public String districts;
		public String languges;
		public int noOfReportersStatewise;
		
		public Channel(String name,String editor,String owner,int income,int addres,
				String anchorNames,String reportersNames,String districts,
				 String languges,int noOfReportersStatewise) 
		{
			pincode=addres;
			this.anchorNames=anchorNames;
			this.districts=districts;
			this.income=income;
			this.languges=languges;
			this.name=name;
			this.noOfReportersStatewise=noOfReportersStatewise;
			this.owner=owner;
			this.reportersNames=reportersNames;
			this.editor=editor;
		}
	  void setName(String name) {
		  this.name=name;
	  }
	  public String getName() {
		  return name;
		  
	  }
	  public void use() {
		  System.out.println(pincode);
		  System.out.println(name);
		  System.out.println(anchorNames);
		  System.out.println(income);
		  System.out.println(districts);
		  System.out.println(languges);
		  System.out.println(noOfReportersStatewise);
		  System.out.println(owner);
		  System.out.println(reportersNames );
		  System.out.println(editor );
	  }

}
