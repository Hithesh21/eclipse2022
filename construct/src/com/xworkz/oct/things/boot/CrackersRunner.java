package com.xworkz.oct.things.boot;

import com.xworkz.oct.things.Crackers;

public class CrackersRunner {

	public static void main(String[] args) {
		String[] temp= {"brown","yellow","blue"};
		Crackers.brand="standard";
		Crackers crackers=new Crackers(1000);
		crackers.setColor(temp);
		String[] ref1=crackers.getColor();
		System.out.println("color :"+ref1);
		crackers.show();
	}

}
