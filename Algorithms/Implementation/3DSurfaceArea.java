import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m+2][n+2];
		for(int i=0;i<m+2;i++){
			for(int j=0;j<n+2;j++){
				if(i==0 || j==0 || i==m+1 || j==n+1){
					a[i][j] = 0;
					continue;
				}
				a[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for(int i=1;i<m+1;i++){
			for(int j=1;j<n+1;j++){
				if(i-1>=0 && a[i][j]>a[i-1][j]) sum += (a[i][j] - a[i-1][j]);
				if(i+1<m+2 && a[i][j]>a[i+1][j]) sum += (a[i][j] - a[i+1][j]);
				if(j-1>=0 && a[i][j]>a[i][j-1]) sum += (a[i][j] - a[i][j-1]);
				if(j+1<n+2 && a[i][j]>a[i][j+1]) sum += (a[i][j] - a[i][j+1]);
			}
		}
		sum += 2*(m*n);
		System.out.println(sum);
	}
}
