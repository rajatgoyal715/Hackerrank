import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int t[]=new int[n];
        for(int i=0;i<n;i++){
            t[i]=sc.nextInt();
        }
        int page=1;
        int p,s,count=0;
        for(int i=0;i<n;i++){
            p=t[i]/k;
            s=1;
            while(p--!=0){
                if(page>=s&&page<=s+k-1)
                   count++;
                s+=k;
                page++;
            }
            if(t[i]%k!=0){
                if(page>=s&&page<=t[i])
                    count++;
                page++;
            }
        }
        System.out.println(count);
    }
}