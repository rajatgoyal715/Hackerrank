import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int l = A.length();
        boolean ispallin = true;
        for (int i = 0; i < l / 2; i++) {
            if (A.charAt(i) != A.charAt(l - 1 - i))
                ispallin = false;
        }
        System.out.println(ispallin ? "Yes" : "No");
    }
}
