import java.io.*;
import java.util.*;

public class JavaPrimalityTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();

        // Write your code here.
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
    }
}
