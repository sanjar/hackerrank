package com.hack;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author msaniar
 * 
 * https://www.hackerrank.com/challenges/diagonal-difference
 *You are given a square matrix of size N×N. Calculate the absolute difference of the sums across the two main diagonals.

Input Format

The first line contains a single integer N. The next N lines contain N integers (each) describing the matrix.

Constraints 
1<=N<=100 
-100<=A[i]<=100
Output Format

Output a single integer equal to the absolute difference in the sums across the diagonals.
 *
 *
 */
public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		BigInteger sum1 = new BigInteger("0");
		BigInteger sum2 = new BigInteger("0");
		for(int i = 0;i<Integer.valueOf(n);i++){
			String[] r = scanner.nextLine().split(" ");
			sum1 = sum1.add(new BigInteger(r[i]));
			sum2 = sum2.add(new BigInteger(r[(Integer.valueOf(n)-1)-i]));
		}
		
		BigInteger x = sum1.subtract(sum2);
		System.out.println(x.abs());
		
		
		
	}
}
