import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BitSet b = new BitSet();
        String ans="YES";
        int num;
        
        while(n--!=0){
            num=sc.nextInt();
            if(b.get(num))
                ans="NO";
            b.set(num);
        }
        System.out.println(ans);
    }
}