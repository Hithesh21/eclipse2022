package things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired()
	// @Qualifier("id5")
	private int id;
	private String name;
	private String owner;
	@Autowired
	// @Qualifier("language5")
	private String language;
	private int price;
	@Autowired
	public NewsPaper(int id,  String name,  String owner, String language, int price) {
		
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.language = language;
		this.price = price;
	}
	
    @Autowired
   // @Qualifier("price5")
   public void setPrice(int price) {
	this.price = price;
}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", owner=" + owner + ", language=" + language + ", price="
				+ price + "]";
	}
    

}
