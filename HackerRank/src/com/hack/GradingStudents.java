package com.hack;

import java.util.Scanner;

/**
 * 
 * @author sanjar
 * 
 *
 */
public class GradingStudents {
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];
        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }
        grades = gradingStudents(grades);
        
        for(int grade : grades) {
        	System.out.println(grade);
        }
	}
	static int[] gradingStudents(int[] grades) {
		
		for(int i=0 ;i<grades.length ;i++) {
			if(grades[i]>=38) {
				int next5multiple = grades[i]/5 + 1;
				grades[i] = (next5multiple*5) - grades[i] <3 ? next5multiple*5:grades[i];
			}
		}
		return grades;
        

    }

}


