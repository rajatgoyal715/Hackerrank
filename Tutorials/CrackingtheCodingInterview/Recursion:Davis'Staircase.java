import java.io.*;
import java.util.*;

public class DavisStaircase {

    static int[] res;
    static int mod = 1000000007;

    //Complete the stepPerms function below.
    public static int stepPerms(int n) {
        if(n == 0) return 1;
        if(n < 0) return 0;
        if(res[n] == -1) {
            int sum = stepPerms(n-3) + stepPerms(n-2) + stepPerms(n-1);
            res[n] = sum;
        }
        return res[n];
    }

    // public static void stepPerms() {
    //     res[1] = 1;
    //     res[2] = 2;
    //     res[3] = 4;
    //     for(int i=4;i<=36;i++){
    //         res[i] = res[i-1] + res[i-2] + res[i-3];
    //     }
    // }

    public static void main(String[] args) {
        res = new int[37];
        for(int i=0;i<37;i++) res[i] = -1;
        stepPerms(36);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num;
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            System.out.println(res[num]);
        }

        sc.close();
    }
}
