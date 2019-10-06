import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int twoCharaters(String s) {
		int l = s.length();
        if(l<2) return 0;
		int c[] = new int[26];
		for(int i=0;i<l;i++){
			c[s.charAt(i) - 'a']++;
		}
		String maxString = "";
		int max = 0;
		for(int i=0;i<26;i++){
			// while(i<26 && c[i]==0) i++;
			for(int j=i+1;j<26;j++){
				// while(j<26 && c[j]==0) j++;
				StringBuilder sb = new StringBuilder();
				for(int k=0;k<l;k++){
					if(s.charAt(k)-'a' == i || s.charAt(k)-'a' == j) sb.append(s.charAt(k));
				}
				String str = sb.toString();
				boolean flag = true;
				for(int k=1;k<str.length();k++){
					if(str.charAt(k) == str.charAt(k-1)) flag = false;
				}
				if(flag && str.length()>max){
					max = str.length();
					maxString = str;
				}
			}
		}
        //System.out.println("Max String : " + maxString);
		return max;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }
}
