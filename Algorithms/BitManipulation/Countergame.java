import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long a[] = new long[63];
        
    static {
        long n=1;
        for(int i=0;i<63;i++){
            a[i]=n;
            n*=2;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            boolean flag=true;
            long n=sc.nextLong();
            int i;
            while(n>1){
                for(i=0;a[i]<n;i++){
                    
                }
                n-=a[i-1];
                flag=!flag;
            }
            System.out.println((flag)?"Richard":"Louise");
        }
    }
}