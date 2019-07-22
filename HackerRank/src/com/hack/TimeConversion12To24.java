package com.hack;

/**
 * 
 * @author sanjar
 * 
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

s: a string representing time in  12 hour format
Input Format

A single string  containing a time in -hour clock format (i.e.:  or ), where  and .

Constraints

All input times are valid

Sample Input 0

07:05:45PM
Sample Output 0

19:05:45
 *
 */
public class TimeConversion12To24 {
	
	public static void main(String[] args) {
		System.out.println(timeConversion("06:40:03AM"));
	}
	
	/*
    * Complete the timeConversion function below.
    */
   static String timeConversion(String s) {
	   String timeWithoutAMPM =s.substring(0,s.lastIndexOf(":")+3);
	   String time[] = timeWithoutAMPM.split(":");
	   boolean isAM = s.substring(s.lastIndexOf(":")+3).equalsIgnoreCase("am");
	   if(isAM) {
		   String hh = time[0];
		   if("12".equalsIgnoreCase(time[0])) {
			   hh="00";
		   }
		   timeWithoutAMPM = hh +":" +time[1] +":" +  time[2];
	   }
	   if(!isAM) {
		   String hh = String.valueOf(Integer.valueOf(time[0])+12);
		   if("12".equalsIgnoreCase(time[0])) {
			   hh="12";
		   }
		   timeWithoutAMPM = hh +":" +time[1] +":" +  time[2];
	   }
	   
	return timeWithoutAMPM;
       

   }

}
