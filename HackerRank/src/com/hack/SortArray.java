package com.hack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArray {

	public static void main(String[] args) {
		
		System.out.println(sortArray(new int[]{1,2,4}));
	}

	private static Map<Integer, String> getIntMap() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		return map;
	}
	
	static int[] sortArray(int[] arr) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("zero",0);
		map1.put("one",1);
		map1.put("two",2);
		map1.put("three",3);
		map1.put("four",4);
		map1.put("five",5);
		map1.put("six",6);
		map1.put("seven",7);
		map1.put("eight",8);
		map1.put("nine",9);
		
		
		
		List<String> li = new ArrayList<String>();
		for(int i : arr){
			li.add(map.get(i));
		}
		Collections.sort(li);
		int[] retArray = new int[arr.length];
 		for(int j=0;j<li.size();j++){
 			retArray[j]= map1.get(li.get(j));
		}
		return retArray;


    }
	private static Map<String, Integer> getStringMap() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one",1);
		map.put("two",2);
		map.put("three",3);
		map.put("four",4);
		map.put("five",5);
		map.put("six",6);
		map.put("seven",7);
		map.put("eight",8);
		map.put("nine",9);
		return map;
	}
}
