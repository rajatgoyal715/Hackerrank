import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void matrixRotation(int[][] a, int r) {
        int n = a.length;
        int m = a[0].length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int min = Math.min(n, m);
        // for(int i=0;i<(min+1)/2;i++){
        //     list.add(new ArrayList<Integer>());
        // }
        for(int k=0;k<(min+1)/2;k++){
            ArrayList<Integer> l = new ArrayList<>();
            int i = k, j = k;
            while(j<m-k){
                l.add(a[i][j]);
                j++;
            }
            j--;
            i++;
            while(i<n-k){
                l.add(a[i][j]);
                i++;
            }
            i--;
            j--;
            while(j>=k){
                l.add(a[i][j]);
                j--;
            }
            j++;
            i--;
            while(i>k){
                l.add(a[i][j]);
                i--;
            }
            // System.out.println(l);
            list.add(l);
        }
        for(int k=0;k<(min+1)/2;k++){
            ArrayList<Integer> l = list.get(k);
            // System.out.println(l);
            int len = l.size();
            int count = 0;
            int i = k, j = k;
            while(j<m-k){
                a[i][j] = l.get((count+r)%len);
                count++;
                j++;
            }
            j--;
            i++;
            while(i<n-k){
                a[i][j] = l.get((count+r)%len);
                count++;
                i++;
            }
            i--;
            j--;
            while(j>=k){
                a[i][j] = l.get((count+r)%len);
                count++;
                j--;
            }
            j++;
            i--;
            while(i>k){
                a[i][j] = l.get((count+r)%len);
                count++;
                i--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int r = in.nextInt();
        int[][] matrix = new int[m][n];
        for(int matrix_i = 0; matrix_i < m; matrix_i++){
            for(int matrix_j = 0; matrix_j < n; matrix_j++){
                matrix[matrix_i][matrix_j] = in.nextInt();
            }
        }
        matrixRotation(matrix, r);
        in.close();
    }
}
