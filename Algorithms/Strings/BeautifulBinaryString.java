import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        char a[]=B.toCharArray();
        int a1,a2,a3;
        int l=a.length;
        a1=a[0];
        a2=a[1];
        int c=0;
        for(int i=2;i<l;i++){
            a3=a[i];
            if(a1=='0'&&a2=='1'&&a3=='0'){
                a[i]='1';
                c++;
                a3=a[i];
            }
            a1=a2;
            a2=a3;
        }
        System.out.println(c);
    }
}
