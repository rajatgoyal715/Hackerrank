import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t1=sc.nextInt();
        while(t1--!=0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            //System.out.println("Testcase "+t1);
            int xor=a[n-1];
            //System.out.println(a[n-1]);
            if(n%2==0)
                xor=0;
            else{
                for(int i=0;i<n-1;i++){
                    /*int t=a[i];
                    xor=xor^t;
                    //System.out.println(a[i]);
                    for(int j=i+1;j<n;j++){
                        t=t^a[j];
                        xor=xor^t;
                    }*/
                    if(i%2==0)
                        xor^=a[i];
                }
            }
            System.out.println(xor);
        }
    }
}