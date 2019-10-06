import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String pwd) {
        if(n<=3) return 6-n;
        boolean num = false, lower = false, upper = false, special = false;
        for(char c : pwd.toCharArray()){
            if(isNum(c)) num = true;
            else if(isLower(c)) lower = true;
            else if(isUpper(c)) upper = true;
            else special = true;
        }
        boolean length = (n>=6);
        int count = 0;
        if(!num) count++;
        if(!lower) count++;
        if(!upper) count++;
        if(!special) count++;
        return (count+n < 6) ? 6-n : count;
    }
    
    static boolean isNum(char c){
        return (c>='0' && c<='9');
    }
    
    static boolean isLower(char c){
        return (c>='a' && c<='z');
    }
    
    static boolean isUpper(char c){
        return (c>='A' && c<='Z');
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
