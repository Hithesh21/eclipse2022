package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringTheater {
	
       public SpringTheater() {
    	   
    	   System.out.println("running SpringTheater ");
	}
       @Bean
       public String buyTicket() {
    	   System.out.println("running buyTicket method........");
    	   String str=new String("Buy");
    	   return str;
       }
       @Bean("pop corn")
       public String buyPopcorn() {
    	   System.out.println("running buy popCorn method........");
    	   String str=new String("BuyPopcorn");
    	   return str;
       }
       @Bean("seat")
       public String BookSeat() {
    	   System.out.println("running BookSeat method........");
    	   String str=new String("Book Seat");
    	   return str;
       }
       @Bean("show")
       public String bookShow() {
    	   System.out.println("running bookShow method........");
    	   String str=new String("Book Show");
    	   return str;
       }
       @Bean
       public String watch() {
    	   System.out.println("running buyTicket method........");
    	   String str=new String("Watch");
    	   return str;
       }

}
