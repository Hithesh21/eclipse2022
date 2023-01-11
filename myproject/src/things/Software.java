package things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("name1")
	private String name;
	@Autowired
	@Qualifier("developer")
	private String developer;
	@Autowired
	@Qualifier("date")
	private String date;
	@Autowired
    private double version;
	@Autowired
    private boolean free;
	
    public Software() {
	// TODO Auto-generated constructor stub
	System.out.println("running software no-args const"); 

}

	@Override
	public String toString() {
		return "Software [name=" + name + ", developer=" + developer + ", date=" + date + ", version=" + version
				+ ", free=" + free + "]";
	}
    
}
