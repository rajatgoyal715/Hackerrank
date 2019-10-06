import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        for(Character c : s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            } else if(stack.isEmpty()){
                break;
            } else if((c==')' && stack.peek()=='(') || (c==']' && stack.peek()=='[') || (c=='}' && stack.peek()=='{')){
                stack.pop();
            }
            i++;
        }
        return (i==s.length() && stack.isEmpty()) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
