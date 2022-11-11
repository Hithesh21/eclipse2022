package com.xworkz.association.boot;

import com.xworkz.association.things.Email;
import com.xworkz.association.things.Job;
import com.xworkz.association.things.NewCity;
import com.xworkz.association.things.NewCompany;
import com.xworkz.association.things.NewCountry;
import com.xworkz.association.things.NewLocation;
import com.xworkz.association.things.NewState;
import com.xworkz.association.things.Person;

public class PersonRunner {

	public static void main(String[] args) {
		Person person=new Person("hithesh");
		Email email1=new Email(9535044021l,"abc@gmail.com", "12345");
		Email email2=new Email(9535044021l,"abc@xworkz.com", "12344");
		Email[] emails= {email1,email2};
		person.setEmail(emails);
		Job job=new Job(50000, "se", false);
		person.setJob(company);
		NewCompany company=new NewCompany("phenix tech","hithesh");
		company.set(company);
		NewLocation location=new NewLocation();
		location.setNewLocation("white field", 20);
		NewCity city=new NewCity();
		city.setNewCity("bangalore", "east", 560100);
		NewState state=new NewState();
		state.setNewState("karnataka","south", 29);
		NewCountry country=new NewCountry();
		country.setNewCountry("india", "asia", "southasia", 91);
		person.show();
	}

}
