package com.xworkz.access.boot;

import com.xworkz.access.office.Bread;
import com.xworkz.access.office.EatBread;
import com.xworkz.access.office.EatSamosa;

public class BreadRunner {

	public static void main(String[] args) {
		Bread bread=new Bread('s', "square", 40, 1, "modern", false, false, "brown", 0, null);
		bread.getCompanyName();
		EatBread eat=new EatBread();
		eat.use(bread);
	}

}
