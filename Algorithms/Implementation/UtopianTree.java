import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int p = n/2;
            int h=1;
            while(p!=0){
                h = 2*h + 1;
                p--;
            }
            if(n%2==1)
                h = h*2;
            System.out.println(h);
            t--;
        }
    }
}