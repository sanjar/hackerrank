package com.hack;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * 
 * @author msaniar
 *
 *https://www.hackerrank.com/challenges/counter-game
 *
 *Problem Statement

Louise and Richard play a game. They have a counter set to N. Louise gets the first turn and the turns alternate thereafter. In the game, they perform the following operations.

If N is not a power of 2, reduce the counter by the largest power of 2 less than N.
If N is a power of 2, reduce the counter by half of N.
The resultant value is the new N which is again used for subsequent operations.
The game ends when the counter reduces to 1, i.e., N == 1, and the last person to make a valid move wins.

Given N, your task is to find the winner of the game.

Update If they set counter to 1, Richard wins, because its Louise' turn and she cannot make a move.

Input Format 
The first line contains an integer T, the number of testcases. 
T lines follow. Each line contains N, the initial number set in the counter.

Constraints

1 <= T <= 10 
1 <= N <= 264 - 1

Note: Range of N is larger than long long int, consider using unsigned long long int.

Output Format

For each test case, print the winner's name in a new line. So if Louise wins the game, print "Louise". Otherwise, print "Richard". (Quotes are for clarity)

Sample Input

1
6
Sample Output

Richard
Explanation

As 6 is not a power of 2, Louise reduces the largest power of 2 less than 6 i.e., 4, and hence the counter reduces to 2.
As 2 is a power of 2, Richard reduces the counter by half of 2 i.e., 1. Hence the counter reduces to 1.
As we reach the terminating condition with N == 1, Richard wins the game.
 */
public class CounterGame {

	public static void main(String[] args) {
		boolean isOdd = false;
		Scanner scanner = new Scanner(System.in);
		String noOfTestCases = scanner.nextLine();
		BigInteger value2 = new BigInteger("2");
		BigInteger value1 = new BigInteger("1");
		BigInteger value0 = new BigInteger("0");
		for(int i = 0;i<Integer.valueOf(noOfTestCases.trim());i++){
			isOdd = false;
			String str = scanner.nextLine();
			BigInteger bigInteger = new BigInteger(str);
			while(bigInteger.compareTo(value1)!=0){
			if((bigInteger.abs().and((bigInteger.abs().subtract(value1)))).compareTo(value0)== 0){
				bigInteger = bigInteger.divide(value2);
			}
			else{
				bigInteger = bigInteger.subtract(largestPowerOf2(bigInteger.abs()));
			}
			if(!isOdd){
				isOdd = true;
			}
			else{
				isOdd=false;
			}
		}
			if(isOdd){
				System.out.println("Louise");
			}
			else{
				System.out.println("Richard");
			}
		}
	}
	
	public static BigInteger largestPowerOf2(BigInteger n)
	   {
		BigInteger res = new BigInteger("2");  
		BigInteger res1 = new BigInteger("2"); 
	        while (res.compareTo(n)< 0) {
	        	if(res.multiply(res1).compareTo(n)>0){
	        		break;
	        	}
	        	res = res.multiply(res1);
	        }

	        return res;
	   }
}
;