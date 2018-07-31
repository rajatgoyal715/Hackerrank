package Greedy;

import java.util.*;
import java.io.*;

/*
 * @author -- rajatgoyal715
 */

public class MaxMin {
    public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(in.readLine());
      int K = Integer.parseInt(in.readLine());
      int[] list = new int[N];

      for(int i = 0; i < N; i ++)
         list[i] = Integer.parseInt(in.readLine());
      
      int unfairness = Integer.MAX_VALUE;
      
      Arrays.sort(list);
      int temp;
      for(int i=0;i<=N-K;i++){
          temp = list[i+K-1]-list[i];
          if(temp<unfairness)
              unfairness = temp;
      }
      
      System.out.println(unfairness);
   }
}
