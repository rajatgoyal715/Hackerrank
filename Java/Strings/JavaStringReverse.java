import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int l = A.length();
        boolean ispallin = true;
        for(int i=0;i<l/2;i++){
            if(A.charAt(i)!=A.charAt(l-1-i))
                ispallin=false;
        }
        if(ispallin)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
