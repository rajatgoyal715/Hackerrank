import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n--!=0){
            String s=sc.nextLine();
            String s1="";
            String s2="";
            for(int i=0;i<s.length();i++){
                if(i%2==0){
                    s1+=s.charAt(i);
                }
                else
                    s2+=s.charAt(i);
            }
            System.out.println(s1+" "+s2);
        }
    }
}