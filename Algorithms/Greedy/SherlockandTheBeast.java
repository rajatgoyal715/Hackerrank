import java.util.Scanner;

public class Solution {
    public static void func(int n){
        int i = n;
        if(n>=0){
        if(n%3==0){
            while(i!=0){
                System.out.print(555);
                i = i-3;
            }
        }
        else{
            func(n-5);
            System.out.print(33333);
        }
        }
        else
            System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            if(n==1 || n==2 || n==4 || n==7)
                System.out.print(-1);
            else
                func(n);
            t--;
            System.out.println();
        }
    }
}