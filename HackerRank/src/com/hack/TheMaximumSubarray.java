package com.hack;

import java.util.Scanner;

/**
 * 
 * @author msaniar
 *https://www.hackerrank.com/challenges/maxsubarray
 *
 *Problem Statement

Given an array A={a1,a2,…,aN} of N elements, find the maximum possible sum of a

Contiguous subarray
Non-contiguous (not necessarily contiguous) subarray.
Empty subarrays/subsequences should not be considered.

This Youtube video by Ben Wright might be useful to understand the Kadane algorithm for the maximum subarray in a 1-D sequence.

Input Format

First line of the input has an integer T. T cases follow. 
Each test case begins with an integer N. In the next line, N integers follow representing the elements of array A.

Constraints:

1<=T<=10
1<=N<=105
-104<=ai<=104
The subarray and subsequences you consider should have at least one element.

Output Format

Two, space separated, integers denoting the maximum contiguous and non-contiguous subarray. At least one integer should be selected and put into the subarrays (this may be required in cases where all elements are negative).

Sample Input

2 
4 
1 2 3 4
6
2 -1 2 3 4 -5
Sample Output

10 10
10 11
 */
public class TheMaximumSubarray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String noOfTestCases = scanner.nextLine();
		for(int i = 0;i<Integer.valueOf(noOfTestCases.trim());i++){
			scanner.nextLine();
			String[] digits = scanner.nextLine().split(" ");
			Integer contigousSum =0;
			Integer contigousSumMax =0;
			Integer nonContigousSum =0;
			for(String s : digits){
					if(Integer.valueOf(s)>0){
						nonContigousSum = nonContigousSum+Integer.valueOf(s);
					}
					contigousSum = contigousSum+Integer.valueOf(s);
					if(contigousSum<0){
						contigousSum=0;
					}
					if(contigousSum>contigousSumMax){
						contigousSumMax=contigousSum;
					}
			}
			System.out.println(contigousSumMax +" " +nonContigousSum);
			
		}
	}
}
