import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int l=s.length();
        BigInteger m=new BigInteger("1000000007");
        BigInteger sum = new BigInteger("0");
        for(int i=0;i<l;i++){
            for(int j=i+1;j<=l;j++){
                sum=sum.add(new BigInteger(s.substring(i,j)));
                sum=sum.remainder(m);
            }
        }
        System.out.println(sum);
    }
}