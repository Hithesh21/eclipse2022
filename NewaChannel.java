package com.xworkz.access.office;

public class NewaChannel {
		public Channel channel;
		
		public void use(Channel channel) {
			  System.out.println(channel.pincode);
			 // System.out.println(channel.name);
			  System.out.println(channel.anchorNames);
			  System.out.println(channel.income);
			  System.out.println(channel.districts);
			  System.out.println(channel.languges);
			  System.out.println(channel.noOfReportersStatewise);
			  System.out.println(channel.owner);
			  System.out.println(channel.reportersNames );
			  System.out.println(channel.editor );
			  
			  
			  channel.getName();
				System.out.println(channel .getName());
				channel .setName("tv9 bharat");
				System.out.println("after changing  :  " +channel .getName());

		  }

}
