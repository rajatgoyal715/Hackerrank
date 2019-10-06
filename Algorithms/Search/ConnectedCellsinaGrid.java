import java.io.*;
import java.util.*;

public class Solution {
    static int m,n;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        String s[];
        int a[][]=new int[m][n];
        boolean visited[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            s=br.readLine().split(" ");
            for(int j=0;j<n;j++){
                a[i][j]=Integer.parseInt(s[j]);
            }
        }
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int temp=dfs(a,visited,i,j);
                if(temp>max)
                    max=temp;
            }
        }
        System.out.println(max);
    }
    
    public static int dfs(int a[][],boolean visited[][],int i,int j){
        if(i<0||j<0||i>=a.length||j>=a[0].length)
            return 0;
        if(visited[i][j])
            return 0;
        visited[i][j]=true;
        if(a[i][j]==0)
            return 0;
        int sum=dfs(a,visited,i,j+1)+dfs(a,visited,i,j-1)+dfs(a,visited,i+1,j)+dfs(a,visited,i+1,j+1)+dfs(a,visited,i+1,j-1)+dfs(a,visited,i-1,j)
                +dfs(a,visited,i-1,j+1)+dfs(a,visited,i-1,j-1);
        return sum+1;
    }
}