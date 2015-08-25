package com.hack;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author msaniar
 * 
 * https://www.hackerrank.com/challenges/sherlock-and-pairs
 * 
 * 
 * Problem Statement

Sherlock is given an array of N integers (A0, A1 ... AN-1 by Watson. Now Watson asks Sherlock how many different pairs of indices i and j exist such that i is not equal to j but Ai is equal to Aj.

That is, Sherlock has to count the total number of pairs of indices (i,j)where Ai =Aj AND i!=j.

Input Format 
The first line contains T, the number of test cases. T test cases follow. 
Each test case consists of two lines; the first line contains an integer N, the size of array, while the next line contains N space separated integers.

Output Format 
For each test case, print the required answer on a different line.

Constraints 
1<=T<=10 
1<=N<=105 
1<=A[i]<=106

Sample input

2
3
1 2 3
3
1 1 2
Sample output

0
2
Explanation 
In the first test case, no two pair of indices exist which satisfy the given condition. 
In the second test case as A[0] = A[1] = 1, the pairs of indices (0,1) and (1,0) satisfy the given condition.
 *
 */

public class SherlockAndPairs {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = 0;
		
		noOfTestCases = Integer.valueOf(scanner.nextLine());	
		List<String[]> list = new ArrayList<>();
		for(int i = 0; i<noOfTestCases;i++){
			scanner.nextLine();
			String[] arr = scanner.nextLine().split(" ");
			list.add(arr);
		}
		
		for(String[] s : list){
			BigInteger c  =	getcountOfTotalNumberOfPairs(s);
		System.out.println(c);
		}
	}

	private static BigInteger getcountOfTotalNumberOfPairs(String[] s) {
		Map<BigInteger, BigInteger> map = new HashMap<BigInteger, BigInteger>();
		for(String value : s){
			if(map.containsKey(BigInteger.valueOf(Long.valueOf(value)))){
				map.put(BigInteger.valueOf(Long.valueOf(value)),map.get(BigInteger.valueOf(Long.valueOf(value))).add(new BigInteger("1")));
			}
			else{
			map.put(BigInteger.valueOf(Long.valueOf(value)), new BigInteger("1"));
			}
		}
		BigInteger count=new BigInteger("0");
		for(BigInteger i : map.values()){
			if(i.compareTo(new BigInteger("1"))==1){
				count = count.add(getNumberOfCombination(i));
			}
		}
		return count;
	}

	private static BigInteger getNumberOfCombination(BigInteger c) {
	    BigInteger fact;
	    if(c.compareTo(new BigInteger("2"))==1){
	    fact = (c.multiply(c.subtract(new BigInteger("1"))));
	    return fact;
	    }
		return new BigInteger("2");
	}

}
