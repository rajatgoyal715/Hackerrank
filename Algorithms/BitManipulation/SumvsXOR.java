import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long count=0;
        while(n!=0) {
            if(n%2==0)
                count++;
            n/=2;
        }
        System.out.println((long)Math.pow(2,count));
    }
}
