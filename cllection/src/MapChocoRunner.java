import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapChocoRunner {

	public static void main(String[] args) {

		
		

		Map<String,Integer> map=new HashMap();
		
		map.put( "cadbury",20);
		map.put("amul",90);
		map.put("parrys",10);
		map.put("nestle",40);
		map.put("choco bite",120); 
		
		System.out.println(map.size());
		
		if(map.isEmpty()) {
			System.out.println("map is empty");
		}else
		{
			System.out.println("map has entries");
		}
		
		System.out.println("===========entered values method..................");
		Collection<Integer> values=map.values();
		values.forEach(e -> System.out.println(e));
		
		System.out.println("==========entered key set method............... ");
		Set<String> key = map.keySet();
		key.forEach(e -> System.out.println(e));

		System.out.println("========entering pair value using entry set method.........");

		Set<Entry< String,Integer >> entry = map.entrySet();
		entry.forEach(e -> System.out.println(e.getKey() + " , " + e.getValue()));	   
        	
		
	}

}
