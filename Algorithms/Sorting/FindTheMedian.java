package Sorting;

import java.util.*;
import java.io.*;

/*
 * @author -- rajatgoyal715
 */

public class FindTheMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[n/2]);
    }
}
