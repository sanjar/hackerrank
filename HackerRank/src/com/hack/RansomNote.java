package com.hack;

import java.util.*;

/**
 * Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs.
 *
 * Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
 *
 * Example
 *  magazine= "attack at dawn"  note= "Attack at dawn"
 *
 * The magazine has all the right words, but there is a case mismatch. The answer is No.
 */
public class RansomNote {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String size = scanner.nextLine();
       // String[] input = scanner.nextLine().split(" ");
        //String magazineLine = scanner.nextLine();
        String[] magazineWords = scanner.nextLine().split(" ");
        //String noteLine = scanner.nextLine();
        String[] noteWords = scanner.nextLine().split(" ");

        checkMagazine(magazineWords, noteWords);

    }

    private static void checkMagazine(String[] magazineWords, String[] noteWords) {
        if (magazineWords.length < noteWords.length) {
            System.out.println("No");
            System.exit(0);
        }

        Map<String,Integer> magazineWordMap = new HashMap<>();

        for(String word: magazineWords){
            if(magazineWordMap.get(word)== null){
                magazineWordMap.put(word,1);
            }
            else{
                magazineWordMap.put(word,magazineWordMap.get(word)+1);
            }
        }

        for(String word: noteWords){
            if(magazineWordMap.get(word)== null || magazineWordMap.get(word) == 0){
                System.out.println("No");
                System.exit(0);
            }
            else{
                magazineWordMap.put(word,magazineWordMap.get(word)-1);
                continue;
            }
        }
        System.out.println("Yes");

    }
}
