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
        int c1[]=new int[n];
        int c2[]=new int[m];
        for(int i=0;i<n;i++)
            c1[i]=sc.nextInt();
        for(int i=0;i<m;i++)
            c2[i]=sc.nextInt();
        int a[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0)
                    a[i][j]=0;
                else if(c1[i-1]==c2[j-1]){
                    a[i][j]=a[i-1][j-1]+1;
                }
                else
                    a[i][j]=Math.max(a[i-1][j],a[i][j-1]);
            }
        }
        int i=n,j=m;
        String ans="";
        while(i>0&&j>0){
            if(c1[i-1]==c2[j-1]){
                ans=c1[i-1]+" "+ans;
                i--;
                j--;
            }
            else if(a[i-1][j]>a[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }
        System.out.println(ans);
    }
}