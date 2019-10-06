import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        int num;
        for(int i=0;i<s.length();i++){
            num=s.charAt(i)-48;
            num=(num+1)%10;
            ans+=num;
        }
        System.out.println(ans);
    }
}