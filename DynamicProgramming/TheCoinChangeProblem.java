import java.util.*;

/*
 * @author -- rajatgoyal715
 */
 
public class TheCoinChangeProblem {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = 0;
        if(n!=0)
            ways = getWays(n, c, m);
        System.out.println(ways);
	}

	public static long getWays(long n, long[] c, int m){
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        if (m <=0 && n >= 1)
            return 0;
        return getWays(n, c, m-1) + getWays(n-c[m-1], c, m);
    }
}