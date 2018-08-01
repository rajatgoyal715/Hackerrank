import java.io.*;
import java.util.*;

public class BalancedBrackets {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char curr : expression.toCharArray()) {
            if (curr == '{' || curr == '(' || curr == '[')
                stack.push(curr);
            else {
                if (stack.isEmpty())
                    return false;
                char last = (char) stack.pop();
                if ((curr == '}' && last != '{') || (curr == ']' && last != '[') || (curr == ')' && last != '('))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String expression = sc.nextLine();
            sb.append(isBalanced(expression) ? "YES\n" : "NO\n");
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
