import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int t=0;
        String a[] = new String[N];
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            int l=emailID.length();
            if(emailID.substring(l-10,l).equals("@gmail.com")){
                a[a0]=firstName;
                //System.out.println("match found");
            }else{
                t++;
                a[a0]="-1";
            }
        }
        Arrays.sort(a);
        for(int i=t;i<N;i++){
            System.out.println(a[i]);
        }
    }
}
