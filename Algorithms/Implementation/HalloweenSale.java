import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int d = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int count = 0;
		while(s >= 0){
			if(p > m){
				s -= p;
				p -= d;
			} else{
				s -= m;
			}
			count++;
		}
		System.out.println(count-1);
	}
}
