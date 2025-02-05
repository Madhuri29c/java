package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapCode {

	public static void main(String[] args) {
		// Creating a HashMap with key and value pair
		Map<Integer,String> map = new HashMap<>();
		//put the key and values
		System.out.println("Here I am printing my dream companies using HashMap");
		map.put(1, "Wipro");
		map.put(2, "Infosys");
		map.put(3, "TCS");
		map.put(4, "Capgemini");
		map.put(5, "Cognizant");
		
		System.out.println("Key 1:"+map.get(1));//Wipro
		System.out.println("Key 2:"+map.get(2));//Infosys
		System.out.println("Key 3:"+map.get(3));//TCS
		System.out.println("Key 4:"+map.get(4));//Capgemini
		System.out.println("Key 5:"+map.get(5));//Cognizant
		
		if(map.containsKey(2)) {//checks that key is present or not
			System.out.println("Key 2 exists its value is:"+map.get(2));
		}
		
		//Iterating the key and value one after another
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		//removing the key 2(Infosys)
		map.remove(2);
		//After removal of key2
		System.out.println("\nMap after removal of key 2:");
		for(Map.Entry<Integer,String>entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		

	}

}
