package com.xworkz.rules.follow;

public class Trainee extends JavaTrainee implements KarnatakaRTO{

	@Override
	public boolean paidTax(double tax) {
		// TODO Auto-generated method stub
		System.out.println("entered paid tax");
		return false;
	}

	@Override
	public double gst() {
		// TODO Auto-generated method stub
		System.out.println("entered gst");

		return 0;
	}

	@Override
	public double vat() {
		// TODO Auto-generated method stub
		System.out.println("entered vat");

		return 0;
	}

	@Override
	boolean training() {
		// TODO Auto-generated method stub
		System.out.println("entered training");

		return false;
	}

	@Override
	boolean executeProgram() {
		// TODO Auto-generated method stub
		System.out.println("entered execute program");

		return false;
	}

}
