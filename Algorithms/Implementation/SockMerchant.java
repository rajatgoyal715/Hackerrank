import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        int a=c[0],pairs=0;
        boolean flag=true;
        for(int i=1;i<n;i++) {
            if(flag&&c[i]==a) {
                pairs++;
                flag=false;
            }
            else{
                a=c[i];
                flag=true;
            }
        }
        System.out.println(pairs);
    }
}
