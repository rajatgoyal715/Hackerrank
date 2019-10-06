import java.util.Scanner;
import java.math.BigInteger;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger sum = a.add(b);
        BigInteger mul = a.multiply(b);
        System.out.println(sum);
        System.out.println(mul);
    }
}