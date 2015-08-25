package com.hack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchMinSumPair {


	public static void main(String[] args) {
		int[] n = new int[]{1,2,3,-4,7,-1,-6,-2,-5,-7};
		System.out.println(searchMinSumPair(n));
 	}
	
	static int[] searchMinSumPair(int[] inputArray) {
		int min1 = inputArray[0];
        int min2 = inputArray[1];
        if (min2 < min1)
        {
            min1 = inputArray[1];
            min2 = inputArray[0];
        }

        for (int i = 2; i <inputArray.length; i++)
            if (inputArray[i] < min1)
            {
                min2 = min1;
                min1 = inputArray[i];
            }
            else if (inputArray[i] < min2)
            {
                min2 = inputArray[i];
            }
		int[] returnArray=new int[]{min1,min2};
		
		return returnArray;


	    }
}
