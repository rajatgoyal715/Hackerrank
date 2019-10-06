import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String month = in.next();
        int mm = in.nextInt();
        //String day = in.next();
        int dd = in.nextInt();
        //String year = in.next();
        int yy = in.nextInt();
        in.close();
        LocalDate dt = LocalDate.of(yy, mm, dd);
        System.out.print(dt.getDayOfWeek());
        
    }
}
