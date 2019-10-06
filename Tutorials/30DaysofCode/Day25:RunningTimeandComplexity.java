import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            System.out.println((isprime(num))?"Prime":"Not prime");
        }
    }
    
    public static boolean isprime(int num){
        if(num<=1)
            return false;
        if(num==2||num==3||num==5)
            return true;
        if(num%2==0||num%3==0||num%5==0)
            return false;
        for(int i=5;i<=Math.sqrt(num);i+=6){
            if(num%i==0)
                return false;
            if(num%(i+2)==0)
                return false;
        }
        return true;
    }
}
