import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        int[] returner = new int[grades.length];
        for(int i = 0 ; i < grades.length ; i++)
            if(grades[i] < 38)
                returner[i] = grades[i];
            else
            {
                int remainder = grades[i]%5;
                int leftremainder = 5 - remainder;
                if(leftremainder < 3 && leftremainder != 0)
                    returner[i] = grades[i] + leftremainder;
                else
                    returner[i] = grades[i];
            }
        return returner;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
