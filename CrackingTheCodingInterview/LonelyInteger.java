import java.io.*;
import java.util.*;

public class LonelyInteger {

    // Complete the findLonely function below.
    static int findLonely(int[] arr) {
        int xor = arr[0];
        for(int i = 1; i < arr.length; i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arrItems = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
        }

        int res = findLonely(arr);
        System.out.println(res);

        sc.close();
    }
}
