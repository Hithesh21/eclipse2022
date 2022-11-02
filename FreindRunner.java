package com.xworkz.access.boot;

import com.xworkz.access.office.Freind;
import com.xworkz.access.office.Freinds;

public class FreindRunner {

	public static void main(String[] args) {
		Freind freind=new Freind("mit","basava","Aakshara",6,1997, 68,true,true,true,42);
		
		freind.getTown();
		
		Freinds freinds=new Freinds();
        freinds.use(freind);
	}

}
