import java.util.*;

public class FibonacciNumbers {

    public static int fibonacci(int n) {
        int a = 0, b = 1, c = 1;
        if (n == 0)
            return a;
        else if (n == 1)
            return b;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}