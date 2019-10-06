import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            Integer b[]=new Integer[n];
            boolean v[]=new boolean[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b, Collections.reverseOrder());
            for(int i=0;i<n;i++)
                b[i]=k-b[i];
            boolean flag=true;
            int count=0;
            for(int i=0;i<n;i++){
                if(a[i]<b[i]){
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}