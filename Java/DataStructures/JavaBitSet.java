import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BitSet b[] = new BitSet[2];
        b[0] = new BitSet(n);
        b[1] = new BitSet(n);
        int m=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<m;i++){
            String s=sc.next();
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            switch(s){
                case "AND":
                    b[n1-1].and(b[n2-1]);
                    break;
                case "OR":
                    b[n1-1].or(b[n2-1]);
                    break;
                case "XOR":
                    b[n1-1].xor(b[n2-1]);
                    break;
                case "FLIP":
                    b[n1-1].flip(n2);
                    break;
                case "SET":
                    b[n1-1].set(n2);
                    break;
            }
            System.out.println(b[0].cardinality()+" "+b[1].cardinality());
        }
    }
}