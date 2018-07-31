import java.util.*;
import java.io.*;

class Abbreviation {

	static boolean isUpperCase(char c) {
		return (c >= 'A' && c <= 'Z');
	}

	static char upperCase(char c) {
		if(isUpperCase(c)) return c;
		return (char)(c + 32);
	}

	boolean dp[][];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int queries = Integer.parseInt(sc.nextLine());
		dp = new int[1011][1011];
		while(queries--!=0){
			String a = sc.nextLine();
			String b = sc.nextLine();
			for(int i=0;i<=a.length();i++){
				for(int j=0;j<=b.length();j++){
					dp[i][j] = false;
				}
			}
			dp[0][0] = true;
			for(int i=0;i<a.length();i++){
				for(int j=0;j<=b.length();j++){
					if(dp[i][j])
				}
			}
		}
	}
}