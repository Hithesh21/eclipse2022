package things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	
	private String name;
	
	private String language;
	
	private int age;
	
	public Actor(@Value("Ramesh") String name,@Value("kannada") String language,@Value("45") int age) {
		super();
		this.name = name;
		this.language = language;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
