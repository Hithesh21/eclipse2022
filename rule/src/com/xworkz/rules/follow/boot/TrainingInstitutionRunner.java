package com.xworkz.rules.follow.boot;

import com.xworkz.rules.Institution;
import com.xworkz.rules.follow.TrainingInstitute;

public class TrainingInstitutionRunner {
	
	public static void main(String[] args) {
		 TrainingInstitute train=new  TrainingInstitute();
		 train.getAdmission();
		 train.play();
		 train.recognition();
		 train.salary();
		 Institution.fees(400);
		 
		 
		
	}

}
