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
            int sum = 0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                sum = sum + a[i];
            }
            int left=0;
            int right=0;
            int flag=0;
            for(int i=0;i<n;i++){
                if(i==0){
                    left = 0;
                    right = sum - a[0];
                }
                else if(i==n-1){
                    left = sum - a[0];
                    right = 0;
                }
                else{
                    left = left + a[i-1];
                    right = right - a[i];
                }
                if(left==right){
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}