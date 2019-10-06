import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
        Arrays.sort(prices);
        int answer = 0;
        int sum = prices[0];
        int i=0;
        while(sum < k){
            answer++;
            i++;
            sum = sum + prices[i];
        }
        System.out.println(answer);
    }
}
