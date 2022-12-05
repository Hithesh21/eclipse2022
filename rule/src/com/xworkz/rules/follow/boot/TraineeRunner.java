package com.xworkz.rules.follow.boot;

import com.xworkz.rules.follow.Trainee;

public class TraineeRunner {

	public static void main(String[] args) {

		Trainee trainee=new Trainee();
		trainee.completeProgram();
		trainee.uploadedTask();
		trainee.gst();
		trainee.eat();
		trainee.paidTax(200);
		trainee.sleep();
		trainee.uploadedTask();
		trainee.vat();
		
		
	}

}
