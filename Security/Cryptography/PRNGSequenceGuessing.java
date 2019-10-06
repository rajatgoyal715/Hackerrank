import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int l1=sc.nextInt();
            int l2=sc.nextInt();
            int a[]=new int[10];
            for(int i=0;i<10;i++){
                a[i]=sc.nextInt();
            }
            for(int i=l1;i<=l2;i++){
                boolean flag=false;
                int seed=i;
                Random r = new Random(seed);
                for(int j=0;j<10;j++){
                    if(r.nextInt(1000)!=a[j]){
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    System.out.print(seed);
                    for(int j=0;j<10;j++){
                        System.out.print(" "+r.nextInt(1000));
                    }
                    System.out.println();
                }
            }
            
        }
    }
}