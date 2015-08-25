package com.hack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIdentifier {

	public static void main(String[] args) {
		System.out.println(validate("_zaSDg564"));
	}
	
static boolean validate(String identifier) {
	Pattern pattern = Pattern.compile("[_$a-zA-Z][$_a-zA-Z0-9]*");
	Matcher matcher = pattern.matcher(identifier);
	System.out.println(Integer.toString(5, 5));
	return matcher.matches();
	
    }
}
