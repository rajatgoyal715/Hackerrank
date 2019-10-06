import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        char c[] =word.toCharArray();
        int max=0;
        int l=c.length;
        for(int i=0;i<l;i++){
            int t=h[c[i]-97];
            if(t>max){
                max=t;
            }
        }
        System.out.println(max*l);
    }
}
