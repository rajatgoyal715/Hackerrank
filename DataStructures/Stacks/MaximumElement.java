import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int st[]=new int[100000];
        int top1=0;
        int top2=1;
        int max[]=new int[100000];
        max[top2]=0;
        for(int j=0;j<n;j++){
            int s=sc.nextInt();
            if(s==1){
                int num=sc.nextInt();
                if(num>=max[top2-1]){
                    max[top2]=num;
                    top2++;
                }
                st[top1]=num;
                top1++;
            }
            else if(s==2){
                if(st[top1-1]==max[top2-1]){
                    max[top2-1]=0;
                    top2--;
                }
                st[top1-1]=0;
                top1--;
            }
            else{
                System.out.println(max[top2-1]);
            }
        }
    }
}