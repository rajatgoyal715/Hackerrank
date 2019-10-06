import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long s1 = sc.nextLong();
        long s2 = sc.nextLong();
        long n = sc.nextLong();
        double rootOfTwo = Math.sqrt(2);
        double speedDiff = s2-s1;
        while(n--!=0){
            long q = sc.nextLong();
            System.out.println(Math.abs((rootOfTwo*(Math.sqrt(q)-l))/speedDiff));
        }
    }
}