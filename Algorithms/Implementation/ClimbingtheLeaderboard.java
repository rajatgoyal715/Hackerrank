import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[] scores = new int[n];
        int[] rank = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        rank[0] = 1;
        for(int i=1; i < n; i++) {
        	if(scores[i] == scores[i-1])
        		rank[i] = rank[i-1];
        	else
        		rank[i] = rank[i-1] + 1;
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        int index = n-1, aliceRank = rank[n-1] + 1;
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
            while(index>=0 && scores[index] <= alice[alice_i]){
                aliceRank = rank[index];
                index--;
            }
            if(index>=0 && scores[index] == alice[alice_i])
                aliceRank = rank[index];
            System.out.println(aliceRank);
        }

	}
}
