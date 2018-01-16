import java.util.*;
import java.io.*;

class FlippingBits {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            long num = sc.nextLong();
            long maxInt=(long)Math.pow(2, 32)-1;
            System.out.println(maxInt-num);
        }
    }
}