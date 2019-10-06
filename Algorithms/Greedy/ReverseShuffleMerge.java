import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        String s1 = s.substring(0, s.length()/2);
//        String s2 = s.substring(s.length()/2);
        String str="";
//        char a[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int count[] = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            int temp = count[i]/2;
            while(temp!=0){
                str = str + (char)(i+97);
                temp--;
            }
        }
        System.out.println(str);
    }
}