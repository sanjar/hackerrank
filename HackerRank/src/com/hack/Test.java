package com.hack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("hello");
		String[] li = new String[] {"hello","hhd","aaaa"};
		List<String> s = Arrays.asList(li);
		
		List<String> list = s.stream().map(v -> v.concat("yesy")).collect(Collectors.toList());
		
		s.stream().forEach(m -> {
			System.out.println(m);
		});
		
		List<String> li1 = list.stream().sorted().limit(1).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(li1);
		
		String s1 = "hell o";
		String s2 = s1.replace(" ", "");
	}

}
