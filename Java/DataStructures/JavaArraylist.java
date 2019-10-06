import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        while(t-->0){
            ArrayList<Integer> b = new ArrayList<Integer>();
            int n= sc.nextInt();
            while(n-->0)
                b.add(sc.nextInt());
            a.add(b);
        }
        int q=sc.nextInt();
        while(q-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y>a.get(x-1).size())
                System.out.println("ERROR!");
            else
                System.out.println(a.get(x-1).get(y-1));
        }
    }
}