import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] a) {
        int n = a.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(a[i], i);
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(a[i] == i+1) continue;
            int num1 = i+1;
            int num2 = a[i];
            int index1 = map.get(num1);
            int index2 = map.get(num2);
            
            //swapping two numbers
            int temp = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;
            
            //updating map of indices
            map.put(num1, index2);
            map.put(num2, index1);
            
            //increasing the count
            count++;
            
            // System.out.println(count);
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
