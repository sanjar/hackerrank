package com.hack;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author msaniar
 *https://www.hackerrank.com/challenges/sherlock-and-squares
 *
 *Problem Statement

Watson gives two integers (A and B) to Sherlock and asks if he can count the number of square integers between A and B (both inclusive).

Note: A square integer is an integer which is the square of any integer. For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.

Input Format 
The first line contains T, the number of test cases. T test cases follow, each in a new line. 
Each test case contains two space-separated integers denoting A and B.

Output Format 
For each test case, print the required answer in a new line.

Constraints 
1<=T<=100 
1<=A<=B<=109

Sample Input

2
3 9
17 24
Sample output

2
0
 */
public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String noOfTestCases = scanner.nextLine();
		for(int i = 0;i<Integer.valueOf(noOfTestCases.trim());i++){
			String[] values = scanner.nextLine().split(" ");
			BigInteger v1 = new BigInteger(values[0]);
			BigInteger v2 = new BigInteger(values[1]);
			if(v1.compareTo(v2)>0){
				BigInteger temp = v1;
				v1= v2;
				v2=temp;
			}
			
			Double v1l =Math.sqrt(v1.longValue());
			Double v2l =Math.sqrt(v2.longValue());
			Double count = Math.floor(v2l) - (Math.floor(v1l));
			if(v1l%1==0 || v2l%1==0){
				count = count+1;
			}
			System.out.println(count.intValue());
		}
	}
}
