import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean isPossible(int m,int[] a,int i){
        if(i<0||a[i]==1)
            return false;
        if(i==a.length-1 || i+m>a.length-1)
            return true;
        a[i]=1;
        return isPossible(m,a,i+1)||isPossible(m,a,i-1)||isPossible(m,a,i+m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            
            System.out.println(isPossible(m,a,0)?"YES":"NO");
        }
    }
}