import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int xor=0;
            int m=1000000007;
            for(int i=0;i<n;i++){
                int x=a[i];
                xor=(xor%m+x%m)%m;
                for(int j=i+1;j<n;j++){
                    x=x^a[j];
                    xor=(xor%m+x%m)%m;
                }
            }
            System.out.println(xor);
        }
    }
}