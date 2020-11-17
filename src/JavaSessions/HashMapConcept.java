//** Nov 13-P1****
package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		//HashMap is a part of Collection --dynamic
		//it is special collection which stores the values in form of key and value
		//Generics
		//can have only one null key
		//can have any number of null values
		Map<String, String> EmpMap=new HashMap<String, String>();
		EmpMap.put("Id", "101"); // put method --> give me the key and value but we have restricted to string only
		EmpMap.put("city", "Montreal");
		EmpMap.put("Country", "Canada");
		EmpMap.put(null, "1000");
		EmpMap.put(null, "2000");
		EmpMap.put("age", null);
		EmpMap.put("phone", null);
		EmpMap.put("Country", "UK");
		
		System.out.println(EmpMap.get("Id"));
		System.out.println(EmpMap.get("city"));
		System.out.println(EmpMap.get("Country"));//get method -> pass the key and get the value
		System.out.println(EmpMap.get(null));
		System.out.println(EmpMap.get(null));
		System.out.println(EmpMap.get("age"));
		System.out.println(EmpMap.get("phone"));
		System.out.println(EmpMap.get("Country"));
		
		//for each loop
		//fetch all key value sets.
		for(Map.Entry<String, String> entry :  EmpMap.entrySet()){
			System.out.println("Key =" + " " + entry.getKey() + " value = " + entry.getValue());
		}
		System.out.println("--------");
		// getting the keys
		for(String s : EmpMap.keySet()) { // KeySet() method to get the keys
			System.out.println("Key = " + s);
		}
		System.out.println("--------");
		for(String v : EmpMap.values()) { // values() method to get the values
			System.out.println("value = " + v);
		}
		System.out.println("--------");
		//Lambda(->) :after JDK1.8
		
		EmpMap.forEach((k,v) -> System.out.println("Key = " + k + "value = " + v));
		
	}

}
