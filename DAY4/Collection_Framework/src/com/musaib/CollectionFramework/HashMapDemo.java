package com.musaib.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

/*A HashMap stores items in key/value pairs,
 *  where each key maps to a specific value.

It is part of the java.util package and 
implements the Map interface.
*/
public class HashMapDemo {

	public static void main(String[] args) {
		
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Ram");
		map.put(2, "sham");
		map.put(3, "john");
		map.put(4, "mohan");
		System.out.println(map);
		
	
	
	}

}
