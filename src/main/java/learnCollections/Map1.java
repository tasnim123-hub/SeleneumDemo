package learnCollections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
		Map<String, String> country=new TreeMap<String, String>();
		
		country.put("Bangladesh", "Dhaka");     //Entry
		country.put("India", "New Delli");
		country.put("UK", "London");
		country.put("USA", "Washington DC");     //Total Entry call=EntrySet
		
		System.out.println(country.size());
		System.out.println(country); //this is not right way
		
		System.out.println("..........................");
		//for each Loop
		for(Entry<String, String> eachCountry : country.entrySet()) {     //eachCountry-iterator
			System.out.println(eachCountry.getKey()+"      "+eachCountry.getValue());  //country.entrySet=Collection
		}
	}

}
 