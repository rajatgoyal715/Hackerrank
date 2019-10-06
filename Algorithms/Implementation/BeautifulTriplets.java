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
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            int num=a[i];
            int count=0;
            for(int j=i;j<n;j++){
                if(num+d==a[j]){
                    //System.out.println(a[j]);
                    count++;
                    num=a[j];
                }
                if(count==2){
                    c++;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}