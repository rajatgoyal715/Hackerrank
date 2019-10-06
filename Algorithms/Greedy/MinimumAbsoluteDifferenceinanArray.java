import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        //method1(a, n);
        
        method2(a, n);
    }
    
    public static void method1(int[] a,int n) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int temp = Math.abs(a[j]-a[i]);
                if(temp < min)
                    min = temp;
            }
        }
        System.out.println(min);
    }
    
    public static void method2(int[] a,int n) {
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<n;i++) {
            int temp = a[i]-a[i-1];
            if(temp < min)
                min = temp;
        }
        System.out.println(min);
    }
}
