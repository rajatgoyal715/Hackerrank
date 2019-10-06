import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[m];
        int d[]=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int sum=0,count;
        for(int i=0;i<m;i++){
            c[i]=sc.nextInt();
            d[i]=sc.nextInt();
            count=0;
            for(int j=0;j<n;j++){
                if((c[i]>=a[j]&&c[i]<=b[j])||(d[i]>=a[j]&&d[i]<=b[j])||(c[i]<=a[j]&&d[i]>=b[j]))
                    count++;
            }
            sum+=count;
        }
        System.out.println(sum);
    }
}