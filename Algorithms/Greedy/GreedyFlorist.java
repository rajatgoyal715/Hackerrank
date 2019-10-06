/* Sample program illustrating input/output methods */
import java.util.*;

class Solution{
   public static void main( String args[] ){
      
// helpers for input/output      

      Scanner in = new Scanner(System.in);
      
      int N, K;
      N = in.nextInt();
      K = in.nextInt();
      
      int C[] = new int[N];
      for(int i=0; i<N; i++){
         C[i] = in.nextInt();
      }
      Arrays.sort(C);
      int result = 0;
      int x =1;
      int j=0;
      for(int i=N-1;i>=0;i--){
          result = result + x*C[i];
          j++;
          if(j==K){
              x++;
              j=0;
          }
      }
      System.out.println( result );
      
   }
}
