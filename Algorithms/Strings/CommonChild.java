import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        int m=a.length;
        int n=b.length;
        int arr[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0)
                    arr[i][j]=0;
                else{
                    if(a[i-1]==b[j-1]){
                        arr[i][j]=arr[i-1][j-1]+1;
                    }
                    else{
                        arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                    }
                }
            }
        }
        System.out.println(arr[m][n]);
    }
}