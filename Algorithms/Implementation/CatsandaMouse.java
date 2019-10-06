import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            print(x, y, z);
        }
    }
    
    public static void print(int x, int y, int z) {
        int distA = Math.abs(z-x);
        int distB = Math.abs(z-y);
        System.out.println((distA < distB) ? "Cat A" : ((distA > distB) ? "Cat B" : "Mouse C"));
    }
}
