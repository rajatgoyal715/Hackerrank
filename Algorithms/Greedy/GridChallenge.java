import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            sc.nextLine();
            char grid[][] = new char[n][n];
            int a[][] = new int[n][n];
            String output = "YES";
            for(int i=0;i<n;i++){
                grid[i] = sc.nextLine().toCharArray();
                for(int j=0;j<n;j++){
                    a[i][j] = (int)(grid[i][j]);
                }
                Arrays.sort(a[i]);
                
            }
            for(int j=0;j<n;j++){
                int temp = a[0][j];
                for(int i=1;i<n;i++){
                    if(a[i][j]<temp)
                        output = "NO";
                    else
                        temp = a[i][j];
                }
            }
            System.out.println(output);
        }
    }
}