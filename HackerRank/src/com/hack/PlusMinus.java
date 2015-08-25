package com.hack;

import java.util.Scanner;

/*
 * 
 * https://www.hackerrank.com/challenges/plus-minus
 * 
 * Problem Statement

You're given an array containing integer values. You need to print the fraction of count of positive numbers, negative numbers and zeroes to the total numbers. Print the value of the fractions correct to 3 decimal places.

Input Format

First line contains N, which is the size of the array. 
Next line contains N integers A1,A2,A3,...,AN, separated by space.

Constraints 
1<=N<=100 
-100<=Ai<=100
Output Format

Output three values on different lines equal to the fraction of count of positive numbers, negative numbers and zeroes to the total numbers respectively correct to 3 decimal places.
 */
public class PlusMinus {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String size = scanner.nextLine();
		String[] input = scanner.nextLine().split(" ");
		Double posCount = 0.0;
		Double negCount = 0.0;
		Double zeroCount = 0.0;
		
		
		
		for(String s : input){
			int v = Integer.valueOf(s);
			if(v>0){
				posCount = posCount+ 1.0;
			}
			else if(v<0){
				negCount = negCount + 1.0;
			}
			else{
				zeroCount = zeroCount + 1.0;
			}
		}
		
		System.out.format("%.3f",posCount/Integer.valueOf(size));
		System.out.println();
		System.out.format("%.3f",negCount/Integer.valueOf(size));
		System.out.println();
		System.out.format("%.3f",zeroCount/Integer.valueOf(size));
	}
}
