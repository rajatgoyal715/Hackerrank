import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        char c[] = "hackerrank".toCharArray();
        int len = "hackerrank".length();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int l = s.length();
            int i=0, j=0;
            int count = 0;
            while (i < l && j < len) {
                if (s.charAt(i) == c[j]) {
                    j++;
                    count++;
                }
                i++;
            }
            System.out.println((count==len)?"YES":"NO");
        }
    }
}
