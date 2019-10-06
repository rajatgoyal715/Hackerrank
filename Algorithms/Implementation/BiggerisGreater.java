import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s=br.readLine();
            char arr[]=s.toCharArray();
            if(!hasNext(arr))
                System.out.println("no answer");
        }
    }
    public static boolean hasNext(char arr[]){
        int n=arr.length;
        int i,j;
        for(i=n-2;i>=0;i--)
            if(arr[i]<arr[i+1])
                break;
        if(i==-1)
            return false;
        j=n-1;
        while(arr[i]>=arr[j])
            j--;
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
        for(int r=n-1,s=i+1;r>s;r--,s++){
            temp=arr[r];
            arr[r]=arr[s];
            arr[s]=temp;
        }
        System.out.println(arr);
        return true;
    }
}