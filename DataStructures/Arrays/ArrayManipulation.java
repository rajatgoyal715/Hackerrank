import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[n];
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            int k = in.nextInt();
            c[a] += k;
            if(b<n-1) c[b+1] -= k;
        }
        in.close();
        long max = 0;
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += (long)c[i];
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
