package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		map.put("CA", "California");
		map.put("TX", "Texas");
		map.put("IL", "Illinois");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(key + "->" + map.get(key));
		}
		System.out.println("After using Map.Entery< K , V > (It is a nested Interface of Map interface)");
		for(Map.Entry<String, String> entry :map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
	}

}
