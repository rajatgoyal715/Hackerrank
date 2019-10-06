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
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int area;
        int max=0;
        for(int i=0;i<n;i++){
            int k=0;
            int h=a[i];
            int min=h;
            for(int j=i;j<n;j++){
                k++;
                h=a[j];
                if(h<min)
                    min=h;
                area=k*min;
                if(area>max)
                    max=area;
            }
        }
        System.out.println(max);
    }
}