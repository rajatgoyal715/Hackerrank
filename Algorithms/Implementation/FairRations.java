import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        int count=0;
        int even=0;
        for(int i=0;i<N;i++){
            if(B[i]%2!=0){
                if(i+1<N){
                    count+=2;
                    B[i]+=1;
                    B[i+1]+=1;
                    even+=1;
                }
            }
            else{
                even++;
            }
        }
        if(even==N)
            System.out.println(count);
        else
            System.out.println("NO");
    }
}
