import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    } 
    public static void insertionSortPart2(int[] ar)
    {       
        int s = ar.length;
        int i=1;
        int temp;
        while(i<s){
            temp = ar[i];
            int j=0;
            while(temp>ar[j]){
                j++;
            }
            for(int k=i;k>j;k--){
                ar[k] = ar[k-1];
            }
            ar[j] = temp;
            printArray(ar);
            i++;
        }
    }
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
