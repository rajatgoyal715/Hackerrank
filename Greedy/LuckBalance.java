package Greedy;

import java.util.*;
import java.io.*;

/*
 * @author -- rajatgoyal715
 */

public class LuckBalance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int t[]=new int[n];
        int sum=0;
        int total=0,n2=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            t[i]=sc.nextInt();
            if(t[i]==1){
                n2++;
                b[i]=a[i];
            }
            else{
                total++;
                sum+=a[i];
                b[i]=-1;
            }
        }
        Arrays.sort(b);
        if(n2>=k){
            for(int i=total;i<n-k;i++){
                sum-=b[i];
            }
            for(int i=n-k;i<n;i++){
                sum+=b[i];
            }
        }
        else{
            for(int i=total;i<n;i++)
                sum+=b[i];
        }
        System.out.println(sum); 
    }
}
