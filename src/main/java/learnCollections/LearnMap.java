package learnCollections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
mp.put("Dinar", 123);
mp.put("Tasnim", 234);
mp.put("Shipa", 345);
mp.put("Ripa", 456);
mp.put("Nipa", 678);

System.out.println(mp.size());

for(Entry<String, Integer> eachmp : mp.entrySet()) {
	System.out.println(eachmp.getKey()+"      "+eachmp.getValue());
}
System.out.println("......................");
//get();
System.out.println(mp.get("Tasnim"));

//get remove();
mp.remove("Shipa"); //just pass the key
System.out.println("...........................");

//After remove size of Map item
System.out.println(mp.size());

//Containskey()-search by the key
System.out.println(mp.containsKey("Nipa"));  //true or false

//ContainsValue()-search by the value
System.out.println(mp.containsValue(456));

//clear();
mp.clear(); //Remove all data/entry
//After clear
System.out.println(mp.size());
System.out.println("..........................");
System.out.println(mp.isEmpty());  //true/false
	}

}
