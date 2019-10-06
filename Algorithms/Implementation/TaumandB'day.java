import java.util.Scanner;

public class Solution {
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long cost = x*a + y*b;
            if(a>b){
                if(b+c<a)
                    cost = x*(b+c) + y*b;
            }
            else if(a<b){
                if(a+c<b)
                    cost = x*a + y*(a+c);
            }
            System.out.println(cost);
        }
    }
}