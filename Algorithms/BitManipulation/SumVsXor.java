package BitManipulation;

import java.util.*;
import java.io.*;

/**
 * Created by rajat goyal on 1/12/2017.
 */

public class SumVsXor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long count=0;
        while(n!=0) {
            if(n%2==0)
                count++;
            n/=2;
        }
        System.out.println((long)Math.pow(2,count));
    }
}
