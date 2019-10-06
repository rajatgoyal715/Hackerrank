import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int count1=0,count2=0;
        int temp;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            //apple[apple_i] = in.nextInt();
            temp = a + in.nextInt();
            if(temp>=s&&temp<=t)
                count1++;
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            //orange[orange_i] = in.nextInt();
            temp = b + in.nextInt();
            if(temp>=s&&temp<=t)
                count2++;
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
