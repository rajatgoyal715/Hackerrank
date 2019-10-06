import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int a[]=new int[101];
    static{
        a[0]=0;
        a[1]=0;
        a[2]=1;
        a[3]=1;
        a[4]=1;
        a[5]=1;
        for(int i=6;i<=100;i++){
            if(a[i-2]==0||a[i-3]==0||a[i-5]==0)
                a[i]=1;
            else
                a[i]=0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n--!=0){
            int t=sc.nextInt();
            System.out.println(a[t]==0?"Second":"First");
        }
    }
}