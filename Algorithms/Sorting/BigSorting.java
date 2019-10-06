import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String[] bigSorting(String[] arr) {
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String s1, String s2){
                int l1 = s1.length(), l2 = s2.length();
                
                if(l1 > l2) return 1;
                else if(l1 < l2) return -1;
                
                int i = 0;
                while(i<l1){
                    if(s1.charAt(i)>s2.charAt(i)) return 1;
                    else if(s1.charAt(i)<s2.charAt(i)) return -1;
                    i++;
                }
                return 0;
            }
        });
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        String[] result = bigSorting(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
