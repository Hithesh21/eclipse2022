package com.xworkz.rules.follow.boot;

import com.xworkz.rules.follow.Paytm;

public class PaytmRunner {

	public static void main(String[] args) {


		Paytm pay=new Paytm();
		pay.balance();
		pay.id();
		pay.pay();
		pay.regBank();
		pay.setPin();
	}

}
