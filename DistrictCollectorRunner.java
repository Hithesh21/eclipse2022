package com.xworkz.copy.boot;
import com.xworkz.copy.*;
public class DistrictCollectorRunner {

	public static void main(String[] args) {
		System.out.println("runner started");
		DistrictCollector ref=new DistrictCollector();
		System.out.println(ref.batch);
		System.out.println(ref.name);
		System.out.println(ref.district);
		ref.batch=2001;
		System.out.println(ref.batch);
		ref.name="shukla";
		ref.district="bangalore";
		System.out.println(ref.name);
		System.out.println(ref.district);
		DistrictCollector ref1=new DistrictCollector();
		System.out.println(ref1.batch);
		System.out.println(ref1.name);
		System.out.println(ref1.district);

	}

}
