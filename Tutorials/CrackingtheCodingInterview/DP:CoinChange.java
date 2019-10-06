import java.io.*;
import java.util.*;

public class CoinChange {

    static int[] w;

    // Complete the ways function below.
    static int ways(int n, int index, int m, int[] coins) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        // if (w[n] == -1) {
            int sum = 0;
            for (int i = index; i < m; i++) {
                sum += ways(n - coins[i], i, m, coins);
            }
            // w[n] = sum;
        // }
        // System.out.println("Ways of finding " + n + " from index : " + index + " = " + w[n]);
        // return w[n];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nm = sc.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] den = sc.nextLine().split(" ");
        int[] coins = new int[m];
        for (int i = 0; i < m; i++) {
            coins[i] = Integer.parseInt(den[i]);
        }

        w = new int[n + 1];
        for (int i = 0; i <= n; i++)
            w[i] = -1;
        int res = ways(n, 0, m, coins);
        System.out.println(res);

        sc.close();
    }

}
