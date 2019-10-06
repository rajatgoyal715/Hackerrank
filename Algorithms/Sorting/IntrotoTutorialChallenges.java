import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i]==num)
                break;
        }
        System.out.println(i);
    }
}