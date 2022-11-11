package com.xworkz.association.things;

public class State {
                    
	public String name;
	public City[] cities;
	 
	public ChiefMinister chiefMinister;
	
	public State(String name) {
		super();
		this.name = name;
	}
	public void setCity(City[] city) {
		this.cities = city;
	}

	public void setChiefMinister(ChiefMinister chiefMinister) {
		this.chiefMinister= chiefMinister;
	}

	public void display() {
		
		System.out.println("name of state :"+name);
		if(cities!=null) {for (int i = 0; i < cities.length; i++) {
			City city = cities[i];
			//System.out.println(city);
			city.display();
		}
		
			if(chiefMinister!=null) {
				chiefMinister.disply();
				
		} else {
			System.out.println("chief minister is null");
		}
		
		
	}
	
	
	}	
}
