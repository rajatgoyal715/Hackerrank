import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        int b[]=new int[n];
        String s1[]=br.readLine().split(" ");
        String s2[]=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(s1[i]);
            b[i]=Integer.parseInt(s2[i]);
        }
        int count1[]=new int[1000];
        int count2[]=new int[1000];
        for(int i=0;i<n;i++){
            count1[a[i]-1]++;
            count2[b[i]-1]++;
        }
        int count=0;
        for(int i=0;i<1000;i++){
            count+=Math.min(count1[i],count2[i]);
        }
        if(count<n)
            count++;
        else if(count==n)
            count--;
        System.out.println(count);
    }
}
