package things;

import org.springframework.stereotype.Component;

@Component
public class Application {
	
	public Application() {
System.out.println("appl class");	
}
 @Override
public String toString() {
System.out.println("tostring in appl");	
return "Application";
}
}
