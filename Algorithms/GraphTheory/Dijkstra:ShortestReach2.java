import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int dist[];
    static int n;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
        n=sc.nextInt();
        int m=sc.nextInt();
        dist=new int[n];
        int a[][]=new int[n][n];
        for(int i=0;i<m;i++){
            int i1=sc.nextInt();
            int i2=sc.nextInt();
            int val=sc.nextInt();
            if(a[i1-1][i2-1]!=0){
                if(val<a[i1-1][i2-1]){
                    a[i1-1][i2-1]=val;
                    a[i2-1][i1-1]=val;
                }
            }
            else{
                a[i1-1][i2-1]=val;
                a[i2-1][i1-1]=val;
            }
        }
        int s=sc.nextInt()-1;
        dijkstra(a,s);
        for(int i=0;i<n;i++){
            if(i!=s){
                if(dist[i]==Integer.MAX_VALUE)
                    System.out.print("-1 ");
                else
                    System.out.print(dist[i]+" ");
            }
        }
        System.out.println();
        }
    }
    
    public static void dijkstra(int[][] a,int s){
        boolean set[] = new boolean[n];
        for(int i=0;i<n;i++){
            dist[i]=Integer.MAX_VALUE; 
            set[i]=false;
        }
        dist[s]=0;
        for(int i=0;i<n-1;i++){
            int u=minDistance(set);
            set[u]=true;
            for(int v=0;v<n;v++){
                if(!set[v]&&a[u][v]!=0&&dist[u]!=Integer.MAX_VALUE&&dist[u]+a[u][v]<dist[v])
                    dist[v]=dist[u]+a[u][v];
            }
        }
    }
    
    public static int minDistance(boolean[] set){
        int min=Integer.MAX_VALUE,min_index=0;
        for(int i=0;i<n;i++){
            if(set[i]==false&&dist[i]<=min){
                min=dist[i];
                min_index=i;
            }
        }
        return min_index;
    }
}