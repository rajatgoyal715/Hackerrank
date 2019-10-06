import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int sum1=0,sum2=0,sum3=0;
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            sum1+=h1[h1_i];
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            sum2+=h2[h2_i];
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            sum3+=h3[h3_i];
        }
        int d1=0,d2=0,d3=0;
        int h;
        while(true){
            if(d1==n1 || d2==n2 || d3==n3){
                h=0;
                break;
            }
            if(sum1==sum2&&sum2==sum3){
                h=sum1;
                break;
            }
            if(sum1>=sum2&&sum1>=sum3){
                sum1-=h1[d1];
                d1++;
            }
            else if(sum2>=sum1&&sum2>=sum3){
                sum2-=h2[d2];
                d2++;
            }
            else if(sum3>=sum1&&sum3>=sum2){
                sum3-=h3[d3];
                d3++;
            }
        }
        System.out.println(h);
    }
}
