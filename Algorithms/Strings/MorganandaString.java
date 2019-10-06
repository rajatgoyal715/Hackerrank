import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t--!=0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int l1 = a.length();
            int l2 = b.length();
            int i=0;
            int j=0;
            String output="";
            while(i<l1&&j<l2){
                if(a.charAt(i)<=b.charAt(j)){
                    output += a.charAt(i);
                    i++;
                }
                else{
                    output += b.charAt(j);
                    j++;
                }
            }
            if(i<l1){
                while(i<l1){
                    output += a.charAt(i);
                    i++;
                }
            }
            if(j<l2){
                while(j<l2){
                    output += b.charAt(j);
                    j++;
                }
            }
            System.out.println(output);
        }
    }
}