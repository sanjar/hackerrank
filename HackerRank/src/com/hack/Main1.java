package com.hack;

import java.math.BigInteger;

public class Main1 {
	
	public static void main(String[] args) {
		System.out.println((new BigInteger(String.valueOf(5)).multiply(new BigInteger(String.valueOf(6)))).subtract(new BigInteger("-1")).longValue());
	}

}
