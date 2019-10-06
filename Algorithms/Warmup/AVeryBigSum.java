import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        while(n!=0){
            sum = sum + sc.nextLong();
            n--;
        }
        System.out.println(sum);
    }
}