package com.hack;

import java.math.BigInteger;
import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String size = scanner.nextLine();
		String[] values = scanner.nextLine().split(" ");
		BigInteger sum = new BigInteger("0");
		for(String v : values){
			sum = sum.add(new BigInteger(v));
		}
		System.out.println(sum);
	}
}
