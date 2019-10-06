import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int k=Integer.parseInt(s[1]);
        int q=Integer.parseInt(s[2]);
        k=k%n;
        int a[]=new int[n];
        String s1[]=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            a[(i+k)%n]=Integer.parseInt(s1[i]);
        }
        while(q-->0){
            System.out.println(a[Integer.parseInt(br.readLine())]);
        }
    }
}