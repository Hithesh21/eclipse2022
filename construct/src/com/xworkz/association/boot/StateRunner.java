package com.xworkz.association.boot;

import com.xworkz.association.things.ChiefMinister;
import com.xworkz.association.things.City;
import com.xworkz.association.things.Name;
import com.xworkz.association.things.State;

public class StateRunner {

	public static void main(String[] args) {
		State state=new State("karnataka");
		Name name=new Name("blr","bendakalur",null);
		Name name1=new Name("blr1","bendakalur1",null);
		 City city=new City(name);
		    City city1=new City(name1);
		    city.setArea(240); 
		    city1.setArea(340);
		    
		    City[] array= {city,city1};
		    state.setCity(array);
		    ChiefMinister chiefMinister=new ChiefMinister("hithesh");
		    state.setChiefMinister(chiefMinister);
		    state.display();
	}

}
