package com.xworkz.access.boot;

import com.xworkz.access.office.EatSamosa;
import com.xworkz.access.office.Samosa;

public class SamosaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samosa samosa=new Samosa("abc", "brown", 't', 1, "small", "flour", false, false, "blr", false, 20);
		samosa.getName();
		EatSamosa eatSamosa=new EatSamosa();
		eatSamosa.use(samosa);
		//samosa .setName("haldirams");not
	}

}
