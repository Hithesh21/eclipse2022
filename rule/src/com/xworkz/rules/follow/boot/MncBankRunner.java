package com.xworkz.rules.follow.boot;

import com.xworkz.rules.follow.MncBank;

public class MncBankRunner {

	public static void main(String[] args) {

		MncBank bank=new MncBank();
		bank.calculateInterest();
		bank.Card();
		bank.checkBalance();
		bank.deposit();
		bank.withdraw();
	}

}
