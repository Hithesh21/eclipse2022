package com.xworkz.rules.follow.boot;

import com.xworkz.rules.School;
import com.xworkz.rules.follow.Student;

public class StudentRunner {

	public static void main(String[] args) {
 
		Student stu=new Student();
		stu.getAdmission();
	boolean	play=stu.play();
	System.out.println(play);
	stu.recognition();
		stu.salary();
	int	fee=School.fees(200);
	System.out.println(fee);
		
	}

}
