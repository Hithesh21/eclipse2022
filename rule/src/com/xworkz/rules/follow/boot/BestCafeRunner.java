package com.xworkz.rules.follow.boot;

import com.xworkz.rules.follow.BestCafe;

public class BestCafeRunner {

	public static void main(String[] args) {

		
		BestCafe cafe=new BestCafe();
		cafe.BookTable();
		cafe.delivery();
		cafe.order();
		cafe.parcel();
		cafe.pay();
	}

}
