import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        String s[]=br.readLine().split(" ");
        for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);
        partition(a,n);
    }
    public static String partition(int a[],int l){
        if(l==0)
            return "";
        if(l==1)
            return (a[0]+" ");
        int temp=a[0];
        int aleft[]=new int[l];
        int amid[]=new int[l];
        int aright[]=new int[l];
        int left=0;
        int mid=0;
        int right=0;
        String s1="";
        String s2="";
        String s3="";
        String t;
        for(int i=0;i<l;i++){
            t=a[i]+" ";
            if(a[i]<temp){
                s1+=t;
                aleft[left++]=a[i];
            }
            else if(a[i]==temp){
                s2+=t;
                amid[mid++]=a[i];
            }
            else{
                s3+=t;
                aright[right++]=a[i];
            }
        }
        String part=partition(aleft,left)+s2+partition(aright,right);
        System.out.println(part);
        //System.out.println(partition(aleft,left)+partition(amid,mid)+partition(aright,right));
        //System.out.println("print : " + s1+s2+s3);
        return part;
    }
}