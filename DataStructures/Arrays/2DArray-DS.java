import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int max = a[0][0] + a[0][1] + a[1][1] + a[0][2] + a[2][0] + a[2][1] + a[2][2];
        int hourglass;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                hourglass = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
                if(hourglass > max)
                    max = hourglass;
            }
        }
        System.out.println(max);
    }
}