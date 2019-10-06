import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char a[] = s.toCharArray();
        int l=a.length;
        int c=1;
        for(int i=0;i<l;i++){
            if(a[i]<=90&&a[i]>=65)
                c++;
        }
        System.out.println(c);
    }
}
