import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int px=sc.nextInt();
            int py=sc.nextInt();
            int qx=sc.nextInt();
            int qy=sc.nextInt();
            System.out.println((2*qx-px) + " " + (2*qy-py));
        }
    }
}