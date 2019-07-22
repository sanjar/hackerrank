package com.hack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HackLandElection {
	
	
	
    private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		electionWinner(null);
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int votesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] votes = new String[votesCount];

        for (int i = 0; i < votesCount; i++) {
            String votesItem = scanner.nextLine();
            votes[i] = votesItem;
        }

        String res = electionWinner(votes);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }

	private static String electionWinner(String[] votes) {
		votes = new String[]{"Victor","Veronica","Veronica","Sss", "Alex", "Alex", "Veronica","Victor","Victor","Victor","Veronica"};
		Map<String, Integer> map = new TreeMap<>();
		for(String vote:  votes) {
			if(map.get(vote) !=null) {
				map.put(vote, map.get(vote)+1);
			}
			else {
				map.put(vote, 1);
			}
		}
		Integer max = 0;
		String winner = "";
		for(String key:map.keySet()) {
			if(map.get(key)>=max) {
				max = map.get(key);
				winner = key;
			}
			
			
		}
		//System.out.println(map);
		return winner;
	}

	

}
