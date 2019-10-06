import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=  new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int temp1,temp2;
        int count=0;
        for(int i=0;i<n;i++){
            temp1 = a[i];
            temp2 = temp1;
            if(temp1<0)
                count++;
            for(int j=i+1;j<n;j++){
                temp2+=a[j];
                if(temp2<0)
                    count++;
            }
        }
        System.out.println(count);
    }
}