package com.hack;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author msaniar
 *
 *staircase-English.pdf
 */
public class Staircase {

	public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
	
	 // Complete the staircase function below.
    static void staircase(int n) {
    	for(int i = n ; i>0;i--) {
    		for(int j = 0 ; j<i-1 ;j++) {
    			System.out.print(" ");
    		}
    		for(int k = 0 ; k<n-i+1 ;k++) {
    			System.out.print("#");
    		}
    		System.out.println();
    	}
    	
    }

    private static final Scanner scanner = new Scanner(System.in);
}
