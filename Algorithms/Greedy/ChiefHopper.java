import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        a[0]=0;
        int curr=n;
        int prev=n-1;
        int energy=0;
        int diff;
        int add=0;
        while(curr!=0){
            diff=a[curr]-a[prev];
            energy+=diff;
            if(energy<0){
                add=0-energy;
            }
            curr--;
            prev--;
        }
        System.out.println(energy+add);
    }
}