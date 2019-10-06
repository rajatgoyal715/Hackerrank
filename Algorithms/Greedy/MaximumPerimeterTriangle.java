import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        boolean flag=false;
        int a=0,b=0,c=0;
        for(int i=n-3;i>=0;i--){
            a=arr[i];b=arr[i+1];c=arr[i+2];
            if((a+b>c)&&(a+c>b)&&(b+c>a)){
                flag=true;
                break;
            }
        }
        System.out.println((flag)?(a+" "+b+" "+c):"-1");
    }
}