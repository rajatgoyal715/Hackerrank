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
            if(n==0){
                System.out.println(0);
                continue;
            }
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int g[][] = new int[n][n];
            int j=0;
            boolean flag;
            int count=0;
            int min=n;
            int size=1;
            g[j][count]=a[0];
            for(int i=1;i<n;i++){
                if(a[i]-1==a[i-1]){
                    size++;
                    g[j][count++]=a[i];
                }
                else{
                    if(size<min)
                        min=size;
                    size=1;
                    count=0;
                    j++;
                    g[j][count]=a[i];
                }
            }
            if(size<min)
                min=size;
            System.out.println(min);
        }
    }
}