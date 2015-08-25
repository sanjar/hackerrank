package com.hack;

import java.math.BigInteger;
import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String noOfTestCases = scanner.nextLine();
		for(int i = 0;i<Integer.valueOf(noOfTestCases.trim());i++){
			String str = scanner.nextLine();
			BigInteger value = new BigInteger(str.trim());
			BigInteger fixed32BitValue = new BigInteger("4294967295");
			BigInteger result = fixed32BitValue.subtract(value);
			System.out.println(result.abs());
		}
	}
}
