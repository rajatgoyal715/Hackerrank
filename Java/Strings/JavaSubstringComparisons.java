import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 
        String str;
        Scanner sc=new Scanner(System.in);
 
        str=sc.nextLine();
        int k;
        k=sc.nextInt();
        int n=str.length()-k;
        String[] arr = new String[n+1];
        for(int i=0;i<=str.length()-k;i++)
            {
            arr[i]=str.substring(i,i+k);
 
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[n]);
 
    }
}