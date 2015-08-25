package com.hack;

public class MinimumDenominations {

	
	public static void main(String[] args) {
		System.out.println(minimumDenominations(49));
	}
	
	static int minimumDenominations(int totalAmount) {
		int note1=20;
		int note2=10;
		
		int coin1=5;
		int coin2=2;
		
		
		int noOfNote1 =0;
		int noOfNote2 = 0;
		int noOfCoin1 = 0;
		int noOfCoin2 =0;
		int noOfCoin3 =0;
		
		
		if(totalAmount>=note1){
			noOfNote1 = totalAmount/note1; 
			totalAmount = totalAmount%note1; 
		}
		if(totalAmount>=note2){
			noOfNote2 = totalAmount/note2; 
			totalAmount = totalAmount%note2; 
		}
		if(totalAmount>=coin1){
			noOfCoin1 = totalAmount/coin1; 
			totalAmount = totalAmount%coin1; 
		}
		if(totalAmount>=coin2){
			noOfCoin2 = totalAmount/coin2; 
			totalAmount = totalAmount%coin2; 
		}
		
		noOfCoin3 = totalAmount;
		
		return noOfNote1+noOfNote2+noOfCoin1+noOfCoin2+noOfCoin3;


    }
}
