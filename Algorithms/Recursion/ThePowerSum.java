import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int count;
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int n = sc.nextInt();
        count = 0;
        power(x, n, 1);
    	System.out.println(count);
    }

    public static void power(int x, int n, int a){
        if(x<0) return;
        if(x==0){
            count++;
            return;
        }
        int temp = (int)Math.pow(a,n);
        for(int i=a;temp<=x;i++){
            temp = (int)Math.pow(i,n);
            x -= temp;
            power(x,n,i+1);
            x += temp;
        }
    }
}