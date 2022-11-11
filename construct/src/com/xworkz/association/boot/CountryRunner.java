package com.xworkz.association.boot;

import com.xworkz.association.things.City;
import com.xworkz.association.things.Country;
import com.xworkz.association.things.Name;
import com.xworkz.association.things.President;

public class CountryRunner {

	public static void main(String[] args) {
		
      Country country=new Country("india");
     
      President president=new President("naidu");
      country.setPresident(president);
      
      Name name =new Name("blr","benda",null);
      Name name1 =new Name("blr1","benda1",null);
    City city=new City(name);
    City city1=new City(name1);
    city.setArea(240); 
    city1.setArea(340);
    
    City[] array= {city,city1};
    country.setCity(array);
    
    
    country.display();
	}

}
