import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int diag1 = 0;
        int diag2 = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
                if(i==j)
                    diag1 = diag1 + a[i][j];
                if(i==n-1-j)
                    diag2 = diag2 + a[i][j];
            }
        }
        
        System.out.println(Math.abs(diag1 - diag2));
    }
}