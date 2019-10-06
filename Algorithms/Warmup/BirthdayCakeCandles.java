import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[n];
		int max = h[0];
		int count = 0;
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			if(h[i] > max) {
				max = h[i];
				count = 0;
			}
			if(h[i] == max) {
				count++;
			}
		}
		System.out.println(count);
	}
}
