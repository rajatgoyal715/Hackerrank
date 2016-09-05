package Implementation;

import java.util.*;
import java.io.*;

/*
 * @author -- rajatgoyal715
 */

public class NonDivisibleSubset {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=a[i]%k;
        }
        int t1,t2;
        int max=0,count;
        for(int i=0;i<n;i++){
            t1=a[i];
            t2=k-a[i];
            count=0;
            for(int j=0;j<n;j++){
                if(a[j]!=t2)
                    count++;
            }
            if(count>max)
                max=count;
        }
        System.out.println(max);
    }
}
