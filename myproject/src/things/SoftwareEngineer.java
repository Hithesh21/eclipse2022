package things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {

	@Autowired
	@Qualifier("name2")
	private String name;
	@Autowired
	@Qualifier("company")
	private String company;
	
	@Autowired
    private double salary;
	@Autowired
    private boolean experience;
	
public SoftwareEngineer() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "SoftwareEngineer [name=" + name + ", company=" + company + ", salary=" + salary + ", experience="
			+ experience + "]";
}

}
