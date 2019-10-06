import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t--!=0){
            String s = sc.nextLine();
            int l = s.length();
            int index=-1;
            for(int i=0;i<l/2;i++){
                if(s.charAt(i)!=s.charAt(l-1-i)){
                    if(pallindrome(s.substring(i+1,l-i)))
                        index = i;
                    else if(pallindrome(s.substring(i,l-1-i)))
                        index = l-1-i;
                    break;
                }
            }
            System.out.println(index);
        }
    }
    public static boolean pallindrome(String s1){
        int l1 = s1.length();
        boolean pall = true;
        for(int i=0;i<l1/2;i++){
            if(s1.charAt(i)!=s1.charAt(l1-1-i)){
                pall = false;
                break;
            }
        }
        return pall;
    }
}
