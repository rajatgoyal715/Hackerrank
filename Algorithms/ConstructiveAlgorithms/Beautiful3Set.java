import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n/3*2;
        if (n%3==2)
            max++;
        int sn = n;
        if (n%3==1)
            sn--;
        System.out.println(max+1);
        int first = max;
        for (int i = (max+1)/2; i >= 0; i--) {
            System.out.println(first+" "+i+" "+(n-i-first));
            first--;
        }
        for (int i = sn-first-1; first >= 0; i--) {
            System.out.println(first+" "+i+" "+(n-i-first));
            first--;
        }
    }
}