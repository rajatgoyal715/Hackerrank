import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int m;
    static int c[];
    static long dp[];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        m = in.nextInt();
        c = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        // HashMap<Integer, Integer> map = new HashMap<>();
        dp = new long[n+1];
        for(int i=0;i<n+1;i++)
            dp[i] = -1;
        System.out.println((n==0)?0:countWays(n));
    }
    
    static long countWays(int n){
        //Time complexity of this function: O(mn)
        //Space Complexity of this function: O(n)
 
        // table[i] will be storing the number of solutions
        // for value i. We need n+1 rows as the table is
        // constructed in bottom up manner using the base
        // case (n = 0)
        long[] table = new long[n+1];
 
        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)
 
        // Base case (If given value is 0)
        table[0] = 1;
 
        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i=0; i<m; i++)
            for (int j=c[i]; j<=n; j++)
                table[j] += table[j-c[i]];
 
        return table[n];
    }
    
    public static long getWays(int n){
        if(n<0) return 0;
        if(dp[n]!=-1){
            System.out.println("returning stored value");
            return dp[n];
        }
        if(n==0) return 1;
        long ways = 0;
        for(int i=0;i<m;i++){
            System.out.println("Checking for " + (n-c[i]));
            ways += getWays(n-c[i]);
        }
        dp[n] = ways;
        System.out.println("Storing dp[" + n + "] = " + ways);
        return dp[n];
    }
}
