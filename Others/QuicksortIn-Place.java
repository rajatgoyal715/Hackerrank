import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);
        sort(a,0,n-1);
    }
    public static void sort(int a[],int s,int e){
        if(s>=e)
            return;
        if(e-s+1<=0)
            return;
        int pivot=a[e];
        int i=s;
        int m;
        for(int j=s;j<e;j++){
            if(a[j]<=pivot){
                m=a[j];
                a[j]=a[i];
                a[i]=m;
                i++;
            }
        }
        m=a[e];
        a[e]=a[i];
        a[i]=m;
        String arr="";
        for(int k=0;k<a.length;k++){
            arr+=a[k]+" ";
        }
        System.out.println(arr);
        sort(a,s,i-1);
        sort(a,i+1,e);
    }
}