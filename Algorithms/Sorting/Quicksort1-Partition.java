import java.util.*;
public class Solution {
       
          static void partition(int[] ar) {
                    int num = ar[0];
              String s1 = "";
              String s2 = "";
              for(int i=1;i<ar.length;i++){
                  if(ar[i]<num)
                      s1 = s1 + ar[i] + " ";
                  else if(ar[i]>num)
                      s2 = s2 + ar[i] + " ";
              }
              System.out.println(s1 + num + " " + s2);
       }   
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
