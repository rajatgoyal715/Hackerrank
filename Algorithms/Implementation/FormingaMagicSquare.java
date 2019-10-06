import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int s[][] = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				s[i][j] = sc.nextInt();
			}
		}

		System.out.println(magicSquare(s));
	}

	public static int magicSquare(int[][] s){
    	int[][][] pre = {
    		{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, 
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}, 
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, 
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
        };

        int min = Integer.MAX_VALUE;
        for(int[][] p : pre){
        	int sum = 0;
        	for(int i=0;i<3;i++){
        		for(int j=0;j<3;j++){
        			sum += Math.abs(p[i][j] - s[i][j]);
        		}
        	}
        	min = Math.min(min, sum);
        }
        return min;
	}
}
