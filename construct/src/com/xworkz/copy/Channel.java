package com.xworkz.copy;

public class Channel{
		public String name;
		public String editor;
		public String owner;
		public int income;
		public int pincode;
		public String[] anchorNames;
		public String[] reportersNames;
		public String[] districts;
		public String[] languges;
		public int[] noOfReportersStatewise;
		
		public Channel(String name,String editor,String owner,int income,int addres,
				String[] anchorNames,String[] reportersNames,String[] districts,
				 String[] languges,int[] noOfReportersStatewise) 
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
		
		public void display() {
			
			System.out.println(name);
			System.out.println(editor);
			System.out.println(owner);
			System.out.println(pincode);
			System.out.println(anchorNames);
			for (int i = 0; i < anchorNames.length; i++) {
				String string = anchorNames[i];
				System.out.println(string);
			}
			System.out.println(reportersNames);
			for (int i = 0; i < reportersNames.length; i++) {
				String string = reportersNames[i];
				System.out.println(string);
			}
			System.out.println(districts);
			for (int i = 0; i <districts.length; i++) {
				String string = districts[i];
				System.out.println(string);
			}
			System.out.println(languges);
			for (int i = 0; i < languges.length; i++) {
				String string = languges[i];
				System.out.println(string);
			}
			System.out.println(noOfReportersStatewise);
			for (int i = 0; i < noOfReportersStatewise.length; i++) {
				int string = noOfReportersStatewise[i];
				System.out.println(string);
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
