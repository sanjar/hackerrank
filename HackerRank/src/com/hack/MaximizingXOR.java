package com.hack;

import java.util.Scanner;

/**
 * 
 * 
 * @author msaniar
 * 
 * https://www.hackerrank.com/challenges/maximizing-xor
 *
 *Problem Statement

Given two integers, L and R, find the maximal value of A xor B, where A and B satisfy the following condition:

L<=A<=B<=R
Input Format

The input contains two lines; L is present in the first line and R in the second line.

Constraints 
1=<=L<=R<=103

Output Format

The maximal value as mentioned in the problem statement.

Sample Input

10
15
Sample Output

7
 */
public class MaximizingXOR {

	static int maxXor(int l, int r) {
		int max = 0;
		for(int i=l;i<=r;i++){
			for(int j = i+1;j<=r;j++){
				if((i^j)>max){
					max=i^j;
				}
			}
		}
		return max;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
