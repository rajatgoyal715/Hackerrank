package DynamicProgramming;

import java.util.*;
import java.io.*;

/*
 * @author -- rajatgoyal715
 */

public class RedJohnIsBack {
    static int max=1000000;
    static int sum[]= new int[max];
    static boolean prime[] = new boolean[max];
    static {
        sum[0]=0;
        sum[1]=0;
        for(int i=2;i<max;i++){
            sum[i]=sum[i-1];
            if(!prime[i]){
                for(int j=2*i;j<max;j+=i){
                    prime[j]=true;
                }
                sum[i]++;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
//            System.out.println("N: "+n);
            int p=0;
            int n1=n/4;
            for(int i=0;i<=n1;i++){
                p+=comb(n-4*i+i,i);
            }
//            System.out.println("P: "+p);
//            System.out.println("No. of primes: "+sum[p]);
            System.out.println(sum[p]);
        }
    }
    public static int fact(int n){
        if(n<=1)
            return 1;
        return fact(n-1)*n;
    }
    
    public static int c(int a,int b){
        return fact(a)/(fact(a-b)*fact(b));
    }
    
    public static int comb(int a,int b){
        if(b>a/2){
            b=a-b;
        }
        if(b==0)
            return 1;
        int num=1,den=1;
        for(int i=0;i<b;i++){
            num*=(a-i);
            den*=(b-i);
        }
        return num/den;
    }
}
