import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String day, month;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        
        if((y>1919 && (y%400==0 || (y%4==0&&y%100!=0))) || (y<1918 && y%4==0)) {
            System.out.println("12.09." + y);
        } else if(y==1918){
            System.out.println("26.09.1918");
        } else {
            System.out.println("13.09." + y);
        }
    }
}
