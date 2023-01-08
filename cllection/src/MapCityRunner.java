import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapCityRunner {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap();
		
		map.put( "bangalore",28);
		map.put("tumkur",30);
		map.put("chikkaballapur",32);
		map.put("bagalkot",40);
		map.put("bidar",41); 
		
		System.out.println(map.size());
		
		if(map.isEmpty()) {
			System.out.println("map is empty");
		}else
		{
			System.out.println("map has entries");
		}
		
		System.out.println("===========entered values method..................");
		Collection<Integer> values=map.values();
		values.forEach(e->System.out.println(e));
		
		
		System.out.println("==============key set method====================");
		Set<String> key=map.keySet();
		key.forEach(e->System.out.println(e));
		
		System.out.println("===============pair entry method==================");
		            Set<Entry<String,Integer>> entry=map.entrySet();
		            entry.forEach(e->System.out.println(e));
		
		
		

	}

}
