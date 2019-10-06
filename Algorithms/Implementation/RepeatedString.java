import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int l = s.length();
        char c[]=s.toCharArray();
        int no[]=new int[l];
        no[0]=0;
        if(c[0]=='a')
            no[0]=1;
        for(int i=1;i<l;i++){
            no[i]=no[i-1];
            if(c[i]=='a')
                no[i]++;
        }
        long r=n/l;
        int rem = (int)(n%l) - 1;
        long sum=0;
        sum+=r*no[l-1];
        if(rem>=0)
            sum+=no[rem];
        System.out.println(sum);
    }
}
