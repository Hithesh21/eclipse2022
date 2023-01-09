package things;

import org.springframework.stereotype.Component;

@Component
public class City {
	
	public City() {
		System.out.println("city class");
	}
	
	@Override
	public String toString() {
		System.out.println("running tostring in city class");
		return " City";
	}

}
