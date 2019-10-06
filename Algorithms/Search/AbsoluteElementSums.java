import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                a[j] = a[j] + b[i];
                sum = sum + Math.abs(a[j]);
            }
            System.out.println(sum);
        }
    }
}