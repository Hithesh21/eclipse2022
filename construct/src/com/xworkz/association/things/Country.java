package com.xworkz.association.things;

public class Country {
	public String name;
	public City[] cities;
	public President president;

	public Country(String name) {
		super();
		this.name = name;
	}

	public void setCity(City[] city) {
		this.cities = city;
	}

	public void setPresident(President president) {
		this.president = president;
	}

	public void display() {
		System.out.println(name);
		if (this.cities != null) {
			for (int i = 0; i < cities.length; i++) {
				City city = cities[i];
				//if(city!=null) {
				//System.out.println(city);

				
				city.display();
				}
			}
		//}
	/*else {
			System.out.println("city is null");
		}*/

		if (this.president != null) {
			//System.out.println(president);
			president.disply();
		} else {
			System.out.println("president is null");
		}
	}

}