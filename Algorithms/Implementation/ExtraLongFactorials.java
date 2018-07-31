package Implementation;

import java.util.Scanner;
import java.math.BigInteger;

/*
 * @author -- rajatgoyal715
 */

public class ExtraLongFactorials {
    public static BigInteger factorial(int num){
        BigInteger fact = BigInteger.ONE;
        for(int i=num;i>1;i--){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(factorial(n));
    }
}
