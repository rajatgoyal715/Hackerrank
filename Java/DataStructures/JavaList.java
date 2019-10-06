import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int q=sc.nextInt();
        while(q-->0){
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("Insert")){
                int x=sc.nextInt();
                int num=sc.nextInt();
                l.add(x,num);
            }
            else{
                int x=sc.nextInt();
                l.remove(x);
            }
        }
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
    }
}
