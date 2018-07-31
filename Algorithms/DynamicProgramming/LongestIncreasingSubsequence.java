import java.io.*;
import java.util.*;

/*
 * @author -- rajatgoyal715
 */

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int dp[] = new int[n];
        // dp[0] = 1;
        for(int i=0;i<n;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++)
                if(a[j]<a[i])
                    dp[i] = Math.max(dp[j]+1, dp[i]);
        }
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
