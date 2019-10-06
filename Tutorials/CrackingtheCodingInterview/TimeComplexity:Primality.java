import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            int count = 0;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    count++;
                    break;
                }
            }
            System.out.println((count!=0 || n==1)?"Not prime":"Prime");
        }
    }
}
