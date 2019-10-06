import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int count=0;
            String c=sc.next();
            for(String a:s){
                if(a.equals(c))
                    count++;
            }
            System.out.println(count);
        }
    }
}