import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=a[i]%k;
        }
        System.out.println(take2(a, b, n, k));
    }

    public static int take2(int[] a, int[] b, int n, int k){
        //printArray(b);
        int f[] = new int[k];
        for(int i : b){
            f[i]++;
        }
        if(k==1) return 1;
        if(k==2){
            return ((f[0]!=0) ? 1 : 0) + ((f[1]!=0) ? 1 : 0);
        }
        //printArray(f);
        int sum = f[0]!=0 ? 1 : 0;
        int mid = (k-1)/2;
        for(int i=1;i<=mid;i++){
            sum += Math.max(f[i], f[k-i]);
        }
        int half = k/2;
        if(half!=1 && k%half==0 && f[half]!=0) sum++;
        return sum;
    }
    
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}