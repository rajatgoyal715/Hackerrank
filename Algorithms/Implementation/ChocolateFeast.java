import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        
        int c = N/C;
        int w = N/C;
        while(w>=M){
            c = c + w/M;
            w = w/M + w%M;
        }
        return c;
    }
    
    
}
