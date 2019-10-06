import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        d=d%n;
        for(int i=0;i<d;i++){
            rotate(a);
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    
    public static void rotate(int[] a){
        int temp=a[0];
        int n=a.length;
        for(int i=0;i<n-1;i++){
            a[i]=a[i+1];
        }
        a[n-1]=temp;
    }
}