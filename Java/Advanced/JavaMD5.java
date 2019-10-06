import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        byte[] message = s.getBytes("UTF-8");
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hash = md.digest(message);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
         sb.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
        }
        
        System.out.println(sb.toString());
        //String encrypted = hash.toString();
        //System.out.println(encrypted);
    }
}