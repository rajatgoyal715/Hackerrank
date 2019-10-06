import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[101];
        int max=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[a[i]]++;
            if(max<b[a[i]]){
                max=b[a[i]];
            }
        }
        System.out.println(n-max);
    }
}