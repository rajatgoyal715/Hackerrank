import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long p = sc.nextInt();
        long q = sc.nextInt();
        long c = 0;
        for(long i=p;i<=q;i++){
            long num = i;
            long d = 0;
            while(num!=0){
                num/=10;
                d++;
            }
            long n = (long)Math.pow(i,2);
            long k = n;
            long d1 = 0;
            while(k!=0){
                k = k/10;
                d1++;
            }
            long r,l;
            r = n%(long)(Math.pow(10,d));
            l = n/(long)(Math.pow(10,d));
            if(l+r==i){
                System.out.print(i + " ");
                c++;
            }
        }
        if(c==0)
            System.out.println("INVALID RANGE");
    }
}