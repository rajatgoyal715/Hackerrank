import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        
        maximumTypeNum(types, n);
    }
    
    public static void maximumTypeNum(int[] types, int n) {
        int count[] = new int[5];
        for (int i = 0; i < n; i++) {
            count[types[i]-1]++;
        }
        
        int max = count[0];
        int type = 0;
        for (int i = 0; i < 5; i++) {
            if(count[i] > max) {
                max = count[i];
                type = i;
            }
        }
        
        // convert it again to 1-index
        System.out.println(type+1);
    }
}
