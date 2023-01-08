import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap();
		
		map.put(560040, "vjn");
		map.put(560010, "rjn");
		map.put(560096, "ypr");
		map.put(560094, "ynk");
		map.put(560079, "basaveshwara nagar"); 
		
		System.out.println(map.size());
		
		if(map.isEmpty()) {
			System.out.println("map is empty");
		}else
		{
			System.out.println("map has entries");
		}
		
		System.out.println("===========entered values method..................");
		Collection<String> values=map.values();
		values.forEach(e -> System.out.println(e));
		
		System.out.println("==========entered key set method............... ");
		Set<Integer> key = map.keySet();
		key.forEach(e -> System.out.println(e));

		System.out.println("========entering pair value using entry set method.........");

		Set<Entry<Integer, String>> entry = map.entrySet();
		entry.forEach(e -> System.out.println(e.getKey() + " , " + e.getValue()));	   
        		   
        		   
        		   
              
              
              
              
              
              
              
              
              
              
	}

}
