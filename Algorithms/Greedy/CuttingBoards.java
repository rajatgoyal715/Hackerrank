import java.util.*;
import java.io.*;

/*
 * @author -- rajatgoyal715
 */

public class CuttingBoards {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        while(t--!=0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            long y[] = new long[m-1];
            for(int i=0;i<m-1;i++){
                y[i] = sc.nextLong();
            }
            long x[] = new long[n-1];
            for(int i=0;i<n-1;i++){
                x[i] = sc.nextLong();
            }
            sb.append(cutBoard(m, n, y, x) + "\n");
        }
        System.out.println(sb.toString());
    }

    public static long cutBoard(int m, int n, long[] y, long[] x){
        Arrays.sort(y);
        Arrays.sort(x);
        int horizontal = 1;
        int vertical = 1;
        int i=m-2;
        int j=n-2;
        long cost = 0;
        long mod = 1000000007;
        while(i>=0&&j>=0){
            if(y[i]>=x[j]){
                cost += vertical*y[i];
                i--;
                horizontal++;
            }
            else{
                cost += horizontal*x[j];
                j--;
                vertical++;
            }
        }
        while(j>=0){
            cost += horizontal*x[j];
            j--;
            vertical++;
        }
        while(i>=0){
            cost += vertical*y[i];
            i--;
            horizontal++;
        }
        return cost%mod;
    }
}
