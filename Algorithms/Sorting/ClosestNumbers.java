import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        String list="";
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int diff = a[i+1] - a[i];
            if(diff<min){
                list = "";
                min = diff;
                list=a[i]+" "+a[i+1]+" ";
            }
            else if(diff==min)
                list+=a[i]+" "+a[i+1]+" ";
        }
        System.out.println(list);
    }
}