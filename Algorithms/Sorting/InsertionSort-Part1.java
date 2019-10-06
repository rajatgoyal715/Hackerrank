import java.util.Scanner;

public class Solution {
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         int i = s-2;
         int temp = ar[s-1];
         while(i>=0 && ar[i]>temp){
             ar[i+1] = ar[i];
             i--;
             printArray(ar);
         }
         ar[i+1] = temp;
         printArray(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
 
