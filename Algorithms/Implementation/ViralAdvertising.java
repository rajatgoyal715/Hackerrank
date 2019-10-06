import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=5,c=0;
        for(int i=0;i<n;i++){
            a/=2;
            c+=a;
            a*=3;
        }
        System.out.println(c);
    }
}