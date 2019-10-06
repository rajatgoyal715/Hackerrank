import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n--!=0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long and=a;
            if(a%4==0){
                for(long i=a+4;i<=b;i+=4){
                    and&=i;
                }
            }
            else if(a%2==0){
                for(long i=a+2;i<=b;i+=2){
                    and&=i;
                }
            }
            else{
                for(long i=a+1;i<=b;i++){
                    and&=i;
                }
            }
            System.out.println(and);
        }
    }
}