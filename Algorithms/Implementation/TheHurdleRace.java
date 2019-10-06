import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int maxHeight = 5;
        int drinks=0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i] > maxHeight)
                maxHeight = height[height_i];
        }
        drinks = (maxHeight>k)?(maxHeight-k):0;
        System.out.println(drinks);
    }
}
