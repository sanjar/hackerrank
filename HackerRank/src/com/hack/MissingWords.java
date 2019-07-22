package com.hack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingWords {
	
	public static List<String> missingWords(String s, String t) {
		if(t.length() == 0)
			return Arrays.asList(s.split(" "));
		String[] sl = s.split(" ");
		String[] ts = t.split(" ");
		List<String> missingWords = new ArrayList<>();
		int j = 0;
		for (int i = 0; i < sl.length; i++) {
			if(j==ts.length || !sl[i].equals(ts[j])) {
				missingWords.add(sl[i]);
			}
			else {
				j++;
			}
		}
		
		/*for(int i = 0; i < ts.length; i++){
			if(s.indexOf(ts[i]) != -1)
				s = s.replaceFirst(ts[i], "");
		}
		
		for(String word : s.split(" ")) {
			if(!word.equals(""))
				missingWords.add(word);
		}*/
		return missingWords;

	    }
	
	public static void main(String[] args) {
		System.out.println(missingWords("I am using hackerrank to improve programming", "am hackerrank to improve"));
	}

}
