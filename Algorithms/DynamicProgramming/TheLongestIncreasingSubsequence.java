import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(findLIS(a, n));
    }
    
    public static int findLIS(int[] a, int n){
        int lis[] = new int[n];
        // String b[] = new String[n];
        int i,j,max=0;
        for(i=0;i<n;i++)
            lis[i] = 1;
        for(i=1;i<n;i++)
            for(j=0;j<i;j++)
                if(a[i]>a[j] && lis[i]<lis[j]+1){
                    lis[i] = lis[j]+1;
                    // b[i] = b[j]+a[i];
                }
        // String maxString = "";
        for(i=0;i<n;i++)
            if(max<lis[i]){
                max = lis[i];
                // maxString = b[i];
            }
        return max;
    }
}