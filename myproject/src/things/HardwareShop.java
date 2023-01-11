package things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	private int id;
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("owner")
	private String owner;
	@Autowired
	@Qualifier("address")
	private String address;
	
	public HardwareShop() {
		System.out.println("running HardwareShop no-args const"); 
			}

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", owner=" + owner + ", address=" + address + "]";
	}
	
	
	

}
