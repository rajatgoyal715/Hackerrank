import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void almostSorted(int[] a) {
        int n = a.length;
        int up = 0, down = 0;
        int l = 0, r = 0;
        if(a[0]>a[1]){
            up++;
            l = 0;
        }
        for(int i=1;i<n-1;i++){
            if(a[i]>a[i-1] && a[i]>a[i+1]){
                if(up==0) l = i;
                up++;
            } else if(a[i]<a[i-1] && a[i]<a[i+1]){
                down++;
                r = i;
            }
        }
        if(a[n-1]<a[n-2]){
            down++;
            r = n-1;
        }
        if(up==0 && down==0) System.out.println("yes");
        else if(checkSwap(a, n, l, r)){
            System.out.println("yes");
            System.out.println("swap " + (l+1) + " " + (r+1));
        } else if(checkReverse(a, n, l, r)){
            System.out.println("yes");
            System.out.println("reverse " + (l+1) + " " + (r+1));
        } else{
            System.out.println("no");
        }
    }
    
    public static boolean checkReverse(int[] a, int n, int l, int r){
        int[] b = new int[n];
        for(int i=0;i<n;i++) b[i] = a[i];
        int mid = (r-l+1)/2;
        for(int i=0;i<mid;i++){
            b[l+i] = a[r-i];
            b[r-i] = a[l+i];
        }
        int i;
        for(i=1;i<n;i++){
            if(b[i]<b[i-1]) break;
        }
        return i==n;
    }
    
    public static boolean checkSwap(int[] a, int n, int l, int r){
        int[] b = new int[n];
        for(int i=0;i<n;i++) b[i] = a[i];
        b[l] = a[r];
        b[r] = a[l];
        int i;
        for(i=1;i<n;i++){
            if(b[i]<b[i-1]) break;
        }
        return i==n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        almostSorted(arr);
        in.close();
    }
}
