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
            int a[][]=new int[2*n][2*n];
            int b[][]=new int[2*n][2*n];
            for(int i=0;i<2*n;i++){
                for(int j=0;j<2*n;j++){
                    a[i][j]=sc.nextInt();
                    b[i][j]=a[i][j];
                }
            }
            int sum=0,t1;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    t1=Math.max(Math.max(a[i][j],a[2*n-1-i][j]),Math.max(a[i][2*n-1-j],a[2*n-1-i][2*n-1-j]));
                    //System.out.println(t1);
                    sum+=t1;
                }
            }
            System.out.println(sum);
        }
    }
}