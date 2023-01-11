package things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	@Qualifier("name3")
	private String name;
	@Autowired
	private short age;
	@Autowired
	@Qualifier("id1")

	private int id;
	@Autowired
	private long mobile;
	@Autowired
	private float height;
	@Autowired
	private double income;
	@Autowired
	private boolean fun;
	@Autowired
	private char shoeSize;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + ", mobile=" + mobile + ", height=" + height
				+ ", income=" + income + ", fun=" + fun + ", shoeSize=" + shoeSize + "]";
	}
	
	

}
