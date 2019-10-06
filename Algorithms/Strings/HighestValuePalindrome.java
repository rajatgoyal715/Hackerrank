import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        char c[] = in.next().toCharArray();
        boolean flag=true;
        boolean v[]=new boolean[n];
        label:
        for(int i=0;i<=n/2;i++){
            if(c[i]>c[n-1-i]){
                if(k>0){
                    k--;
                    c[n-1-i]=c[i];
                    v[n-1-i]=true;
                }
                else{
                    flag=false;
                    break label;
                }
            }
            else if(c[i]<c[n-1-i]){
                if(k>0){
                    k--;
                    c[i]=c[n-1-i];
                    v[i]=true;
                }
                else{
                    flag=false;
                    break label;
                }
            }
        }
        if(!flag){
            System.out.println("-1");
        }
        else{
            for(int i=0;i<=n/2;i++){
                if(c[i]!='9'&&c[n-1-i]!='9'){
                if(k>0&&(v[i]||v[n-1-i])){
                    k--;
                    c[i]='9';
                    c[n-1-i]='9';
                }
                else if(k>0&&i==n/2){
                    k--;
                    c[i]='9';
                    c[n-1-i]='9';
                }
                else if(k>1){
                    k-=2;
                    c[i]='9';
                    c[n-1-i]='9';
                }
                }
            }
            System.out.println(c);
        }
    }
}
