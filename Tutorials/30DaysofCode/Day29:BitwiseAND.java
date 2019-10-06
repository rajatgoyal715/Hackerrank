import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int and=0;
            int temp;
            for(int i=1;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    temp=i&j;
                    if(temp<k)
                        if(temp>and)
                            and=temp;
                }
            }
            System.out.println(and);
        }
    }
}
