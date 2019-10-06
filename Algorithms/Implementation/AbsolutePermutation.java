import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(k==0){
                for(int i=0;i<n;i++){
                    System.out.print((i+1)+" ");
                }
                System.out.println();
            }
            else if(n%k!=0 && n/k%2!=0){
                System.out.println("-1");
            }
            else{
                StringBuilder sb = new StringBuilder();
                boolean flag=true;
                label:
                for(int x=1; x<=n; x+=2*k) {
                    for(int y=k; y<2*k; y++) {
                        if(x+y>n){
                            flag=false;
                            break label;
                        }
                        sb.append(x+y+" ");
                    }
                    for(int y=0; y<k; y++) {
                        if(x+y>n){
                            flag=false;
                            break label;
                        }
                        sb.append(x+y+" ");
                    }
                }
                System.out.println(flag?sb:"-1");
                /*String ans="";
                int num;
                int s1=1,s2=1+k;
                int index=0;
                boolean flag=true;
                label:
                while(index<n){
                    for(int i=0;i<k&&index<n;i++){
                        if(s2+i>n){
                            flag=false;
                            break label;
                        }
                        ans+=(s2+i)+" ";
                        index++;
                    }
                    for(int i=0;i<k&&index<n;i++){
                        if(s1+i>n){
                            flag=false;
                            break label;
                        }
                        ans+=(s1+i)+" ";
                        index++;
                    }
                    s2+=2*k;
                    s1+=2*k;
                }
                System.out.println(flag?ans:"-1");
                */
            }
        }
    }
}
