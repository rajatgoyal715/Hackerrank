import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        method1(calories, n);
    }
    
    public static void method1(int[] c,int n) {
        Arrays.sort(c);
        long sum = 0;
        int num = 0;
        for(int i=n-1;i>=0;i--) {
            sum += ((long)(Math.pow(2, num++)) * c[i]);
        }
        System.out.println(sum);
    }
}
