import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int b[]=new int[1000000];
            for(int i=0;i<n;i++){
                b[sc.nextInt()-1]++;
            }
            long count=0;
            for(int i=0;i<1000000;i++){
                count+=(long)b[i]*(long)(b[i]-1);
            }
            System.out.println(count);
        }
    }
}