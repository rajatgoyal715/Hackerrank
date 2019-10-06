import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            int max=a[0],cmax=0;
            int sum2=0,max2=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(a[i]>max2)
                    max2=a[i];
                if(a[i]>0)
                    sum2+=a[i];
                cmax = Math.max(a[i],cmax+a[i]);
                max = Math.max(max,cmax);
            }
            if(max2<0)
                sum2=max2;
            System.out.println(max+" "+sum2);
        }
    }
}