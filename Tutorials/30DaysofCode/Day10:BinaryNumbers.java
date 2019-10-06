import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c=1;
        int max=0;
        boolean prev=false;
        while(n!=1){
            if(n%2==1){
                if(prev)
                    c++;
                else{
                    c=1;
                    prev=true;
                }
            }
            else{
                if(c>max)
                    max=c;
                prev=false;
            }
            n/=2;
        }
        if(prev)
            c++;
        if(c>max)
            max=c;
        System.out.println(max);
    }
}
