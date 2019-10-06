import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int i=0,j=0;
            label:
            for(i=0;i<n-1;i++){
                int temp=m-a[i];
                for(j=i+1;j<n;j++){
                    if(a[j]==temp)
                        break label;
                }
            }
            System.out.println((i+1)+" "+(j+1));
        }
    }
}