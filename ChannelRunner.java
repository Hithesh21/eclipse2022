package com.xworkz.access.boot;

import com.xworkz.access.office.Channel;
import com.xworkz.access.office.NewaChannel;

public class ChannelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Channel channel=new Channel("tv9", "ranga", "ambani", 800000, 560001," shreya","null" , "abc","lala", 200);
channel.getName();
NewaChannel newaChannel=new NewaChannel();
newaChannel.use(channel);
	}

}
