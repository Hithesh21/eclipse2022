package things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	
	private String name;
	private int duration ;
	private String startingMonth;
	
	public Season() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}
    @Value("summer")
	public void setName(String name) {
		this.name = name;
	}
    @Value("3")
	public void setDuration(int duration) {
		this.duration = duration;
	}
    @Value("march")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	



}
