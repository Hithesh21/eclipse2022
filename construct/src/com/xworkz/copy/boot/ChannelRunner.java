package com.xworkz.copy.boot;

import com.xworkz.copy.Channel;

public class ChannelRunner {

	public static void main(String[] args) {
		String[] anchor= {"bharadwaj" ,"neha","arun"};
		String[] reporter= {"schi","ramesh","balaji"};
        String[] district= {"blr" ,"hubli","tumkur"};
		String[] lan= {"kannada","hindi"};
		int[]	no= {20,50,80,90};
		Channel channel=new Channel("tv9", "ranga", "ambani", 800000, 560001, anchor, reporter, district, lan, no);
		channel.display();
	}

}
