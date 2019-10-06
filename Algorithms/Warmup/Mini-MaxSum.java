import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l=5;
        long arr[] = new long[l];
        for(int i=0;i<l;i++)
            arr[i] = in.nextLong();
        long min=Long.MAX_VALUE, max=Long.MIN_VALUE, sum=0;
        for(int i=0;i<l;i++){
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
            sum+=arr[i];
        }
        System.out.println((sum-max)+" "+(sum-min));
    }
}
