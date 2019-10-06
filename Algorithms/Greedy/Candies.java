import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int n;

    public static void main(String[] args) {
        int i,arr[],temp=1,prev=0,count[];
        long candies=0; 
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n];
        count = new int[n];
        for(i=0;i<n;i++){
            scan.nextLine();
             arr[i] = scan.nextInt();
            count[i] = 1;
        }
      for(i=1;i<n;i++){
          if(arr[i]>arr[i-1]){
               count[i] = count[i-1]+1;
          }
          /*
          else if(i!=0 && arr[i]<arr[i-1]){
              int j = i;
              while(j>0 && arr[j] < arr[j-1]){
                  count[j-1] = Math.max(count[j-1],count[j] + 1); 
                  j--;
              }
          }*/
      }
        for(i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                count[i]=Math.max(count[i],count[i+1]+1);
            }
        }
        for(i=0;i<n;i++)
            candies += count[i];
        System.out.print(candies);
    }
}