import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder("");
        while(t--!=0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            // String s1[] = br.readLine().split(" ");
            // int m = Integer.parseInt(s1[0]);
            // int n = Integer.parseInt(s1[1]);
            long y[] = new long[m-1];
            // String s2[] = br.readLine().split(" ");
            for(int i=0;i<m-1;i++){
                y[i] = sc.nextLong();
                // y[i] = Integer.parseInt(s2[i]);
            }
            long x[] = new long[n-1];
            // String s3[] = br.readLine().split(" ");
            for(int i=0;i<n-1;i++){
                x[i] = sc.nextLong();
                // x[i] = Integer.parseInt(s3[i]);
            }
            sb.append(cost(m, n, y, x) + "\n");
        }
        System.out.println(sb.toString());
    }

    public static long cost(int m, int n, long[] y, long[] x){
        Arrays.sort(y);
        Arrays.sort(x);
        int horizontal = 1;
        int vertical = 1;
        int i=m-2;
        int j=n-2;
        long cost = 0;
        long mod = 1000000007;
        while(i>=0&&j>=0){
            if(y[i]>=x[j]){
                cost += vertical*y[i];
                // if(cost>=mod) cost%=mod;
                i--;
                horizontal++;
            }
            else{
                cost += horizontal*x[j];
                // if(cost>=mod) cost%=mod;
                j--;
                vertical++;
            }
        }
        while(j>=0){
            cost += horizontal*x[j];
            // if(cost>=mod) cost%=mod;
            j--;
            vertical++;
        }
        while(i>=0){
            cost += vertical*y[i];
            // if(cost>=mod) cost%=mod;
            i--;
            horizontal++;
        }
        return cost%mod;
    }
}