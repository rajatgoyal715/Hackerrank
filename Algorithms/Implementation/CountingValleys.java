import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char c[] = sc.next().toCharArray();
		int level = 0;
		int num = 0;
		for(int i=0;i<n;i++) {
			if(c[i]=='D'){
				level--;
				if(level==-1)
					num++;
			} else {
				level++;
				if(level==0)
					num++;
			}
		}
		System.out.println(num/2);
	}
}