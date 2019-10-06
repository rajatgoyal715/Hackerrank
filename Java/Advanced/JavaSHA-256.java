import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.update(text.getBytes());
        byte[] hash = digest.digest();
        
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
         sb.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
        }
        
        System.out.println(sb.toString());
    }
}