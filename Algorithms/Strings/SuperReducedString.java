import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        System.out.println(check(s,l));
    }
    
    public static String check(String s,int l){
        if(l==0)
            return "Empty String";
        char a=s.charAt(0);
        char b;
        for(int i=1;i<l;i++){
            b=s.charAt(i);
            if(b==a){
                s=s.substring(0,i-1)+s.substring(i+1,l);
                l-=2;
                return check(s,l);
            }
            a=b;
        }
        return s;
    }
}