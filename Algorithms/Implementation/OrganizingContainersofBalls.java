import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String organizingContainers(int[][] c) {
        int n = c.length;
		boolean flag = true;
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i] += c[i][j];
			}
		}
		for(int j=0;j<n;j++){
			for(int i=0;i<n;i++){
				b[j] += c[i][j];
			}
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<n;i++){
			if(a[i]!=b[i]){
				flag = false;
				break;
			}
		}
		return flag ? "Possible" : "Impossible";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] container = new int[n][n];
            for(int container_i = 0; container_i < n; container_i++){
                for(int container_j = 0; container_j < n; container_j++){
                    container[container_i][container_j] = in.nextInt();
                }
            }
            String result = organizingContainers(container);
            System.out.println(result);
        }
        in.close();
    }
}
