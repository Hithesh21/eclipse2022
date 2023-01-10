package things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("india")
	private String country;
	
	@Value("Shakthi")
    private String name;
	
	@Value("220")
    private double budget;
	
	public Rocket() {
		System.out.println("====== rocket const=========");
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
	


}
