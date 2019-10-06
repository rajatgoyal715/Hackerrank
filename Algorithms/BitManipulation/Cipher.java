import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String item[]=br.readLine().split(" ");
        int n=Integer.parseInt(item[0]);
        int k=Integer.parseInt(item[1]);
        int c= br.read()-48;
        int str[] = new int[n];
        str[0]=c;
        int cur=c;
        int xor=cur;
        for(int i=1;i<n;i++){
            int num=br.read()-48;
            if(i<k){
                cur=x(xor,num);
                //xor=x(xor,cur);
            }
            else if(i<n){
                xor=x(xor,str[i-k]);
                cur=x(xor,num);
                //xor=x(xor,cur);
            }
            xor=num;
            str[i]= cur;
            //System.out.println(str[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(str[i]);
        }
    }
    public static int x(int a,int b){
        if(a==b)
            return 0;
        else
            return 1;
    }
}