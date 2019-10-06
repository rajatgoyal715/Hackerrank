import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            char a[]=s.toCharArray();
            int l=a.length,c=0;
            int b[]=new int[26];
            for(int i=0;i<l;i++){
                int j=a[i]-97;
                if(b[j]==0){
                    b[j]++;
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
