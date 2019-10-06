import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            boolean a[][] = new boolean[n][n];
            for(int i=0;i<m;i++){
                int a1=sc.nextInt();
                int b1=sc.nextInt();
                a[a1-1][b1-1]=true;
                a[b1-1][a1-1]=true;
            }
            int s=sc.nextInt()-1;
            for(int i=0;i<n;i++){
                if(s==i){
                    continue;
                }
                boolean v[][]=new boolean[n][n];
                System.out.print(distance(v,a,s,i,n)+" ");
            }
            System.out.println();
        }
    }
    
    public static int distance(boolean v[][], boolean a[][], int s, int i, int n){
        if(a[s][i]){
            v[s][i]=true;
            return 6;
        }
        int min=6*(n-1);
        int dist=-1;
        boolean flag=false;
        for(int j=0;j<n;j++){
            if(s==j)
                continue;
            if(a[s][j]&&!v[s][j]){
                v[s][j]=true;
                v[j][s]=true;
                int t=distance(v,a,j,i,n);
                if(t!=-1){
                    flag=true;
                    if(t+6<min)
                        min=t+6;
                }
            }
        }
        if(flag)
            dist=min;
        return dist;
    }
}