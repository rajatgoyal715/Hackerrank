import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int count=0;
        for(int i=1;i<=100;i++){
            boolean a1=true,a2=true;
            label1:
            for(int j=0;j<n;j++){
                if(i%a[j]!=0){
                    a1=false;
                    break label1;
                }
            }
            label2:
            for(int j=0;j<m;j++){
                if(b[j]%i!=0){
                    a2=false;
                    break label2;
                }
            }
            if(a1&&a2)
                count++;
        }
        System.out.println(count);
    }
}
