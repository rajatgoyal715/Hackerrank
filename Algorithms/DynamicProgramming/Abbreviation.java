import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        sc.nextLine();
        while(q--!=0){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            String s=s1.toUpperCase();
            char a[]=s.toCharArray();
            char b[]=s2.toCharArray();
            char c[]=s1.toCharArray();
            System.out.println((count(c,b)&&order(a,b))?"YES":"NO");
        }
    }
    public static boolean count(char c[],char b[]){
        int l1=c.length;
        int l2=b.length;
        int n=0;
        for(int i=0;i<l1;i++){
            if(c[i]>=65&&c[i]<=90)
                n++;
        }
        if(n>l2)
            return false;
        return true;
    }
    public static boolean order(char a[],char b[]){
        int l1=a.length;
        int l2=b.length;
        int f=0;
        for(int i=0;i<l1;i++){
            if(a[i]==b[f]){
                f++;
                if(f==l2)
                    return true;
            }
        }
        return false;
    }
}