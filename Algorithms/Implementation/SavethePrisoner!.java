import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt()-1;
            while(m-->0){
                s++;
                if(s>n)
                    s=s%n;
            }
            //int a=(s+m-1)%5;
            System.out.println(s);
        }
    }
}