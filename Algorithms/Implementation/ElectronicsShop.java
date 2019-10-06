import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int key[] = new int[n];
		int usb[] = new int[m];
		for(int i=0;i<n;i++) key[i] = sc.nextInt();
		for(int i=0;i<m;i++) usb[i] = sc.nextInt();
		int max = -1;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(key[i] + usb[j] <= s) max = Math.max(max, key[i] + usb[j]);
			}
		}
		System.out.println(max);
    }
}
