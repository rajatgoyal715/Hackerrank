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
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        int a[]=new int[n];
        int i=0;
        int max=0;
        while(i==c[0]){
            a[i]=Math.abs(c[0]-i);
            //System.out.println("1 "+a[i]);
            if(a[i]>max){
                max=a[i];
            }
            i++;
        }
        int curr=0,next=1;
        while(next<m&&i<n){
            a[i]=Math.min(Math.abs(c[next]-i),Math.abs(i-c[curr]));
            //System.out.println("2 "+a[i]+" "+(c[next]-i)+" "+(i-c[curr]));
            if(a[i]>max){
                max=a[i];
            }
            if(c[next]<=i){
                curr++;
                next++;
            }
            i++;
        }
        //System.out.println(curr+" "+next);
        while(i<n){
            a[i]=Math.abs(c[curr]-i);
            //System.out.println("3 "+a[i]);
            if(a[i]>max){
                max=a[i];
            }
            i++;
        }
        System.out.println(max);
    }
}
