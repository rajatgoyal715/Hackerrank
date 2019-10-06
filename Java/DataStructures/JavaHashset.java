import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str=sc.nextLine();
            s.add(str);
            System.out.println(s.size());
        }
    }
}