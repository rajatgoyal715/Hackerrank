package Greedy;

import java.util.*;
import java.io.*;

/*
 * @author -- rajatgoyal715
 */

public class CuttingBoards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
        int m = sc.nextInt();
        int n = sc.nextInt();
        int y[] = new int[m-1];
        for(int i=0;i<m-1;i++){
            y[i] = sc.nextInt();
        }
        Arrays.sort(y);
        int x[] = new int[n-1];
        for(int i=0;i<n-1;i++){
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int horizontal = 1;
        int vertical = 1;
        int i=m-2;
        int j=n-2;
        int cost = 0;
        int m1=1000000007;
        if(y[i]>=x[j]){
            cost = cost + y[i];
            cost%=m1;
            horizontal++;
            i--;
        }
        else{
            cost = cost + x[j];
            cost%=m1;
            vertical++;
            j--;
        }
        while(i>=0&&j>=0){
            if(y[i]>=x[j]){
                cost += vertical*y[i];
                cost%=m1;
                i--;
                horizontal++;
            }
            else{
                cost += horizontal*x[j];
                cost%=m1;
                j--;
                vertical++;
            }
        }
        if(j>=0){
            while(j>=0){
                cost += horizontal*x[j];
                cost%=m1;
                j--;
                vertical++;
            }
        }
        else if(i>=0){
            while(i>=0){
                cost += vertical*y[i];
                cost%=m1;
                i--;
                horizontal++;
            }
        }
        System.out.println(cost%m1);
        }
    }
}
