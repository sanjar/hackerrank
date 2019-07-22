package com.hack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 
 * mini-max-sum-English.pdf
 * @author msaniar
 *
 */
public class MinMaxSum {
	static long totalSum = 0;
	// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	Arrays.sort(arr);
    	
    	IntStream.range(0, 5).forEach((i) -> {
    		totalSum +=arr[i];
    	});
    	
    	System.out.println((totalSum-arr[4]) + " " + (totalSum-arr[0]));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
