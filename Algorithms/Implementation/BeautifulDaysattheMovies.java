import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        int b=0;
        for(int x=i;x<=j;x++){
            if(Math.abs(x-rev(x))%k==0)
                b++;
        }
        System.out.println(b);
    }
    
    public static int rev(int x){
        int r=0;
        while(x!=0){
            r=r*10+x%10;
            x/=10;
        }
        return r;
    }
}