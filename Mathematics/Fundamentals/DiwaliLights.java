import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int mod = 100000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            System.out.println((power(2,n)-1+mod)%mod);
        }
    }
    
    static int power(int x, int n) {
        if(x==0) return 1;
        if(n==0) return 1;
        return ((power(x,n-1)%mod) * (x%mod))%mod;
    }
}