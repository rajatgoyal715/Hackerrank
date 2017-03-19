import java.util.*;
import java.io.*;

/**
 * Created by rajat goyal on 3/19/2017.
 */

public class DrawingBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();

        int total = n / 2 + 1;
        int start = p / 2;
        int end = total - start - 1;

        System.out.println(Math.min(start, end));
    }
}
