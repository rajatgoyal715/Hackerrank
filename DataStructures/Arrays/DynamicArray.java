import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1[]=br.readLine().split(" ");
        int n=Integer.parseInt(s1[0]);
        int q=Integer.parseInt(s1[1]);
        
        // arraylist of arraylist
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>(n);
        
        //initialise that there are a total of n lists..
        for(int i=0;i<n;i++){
            ArrayList<Integer> sub=new ArrayList<Integer>();
            al.add(sub);
        }
        int lastans=0;
        while(q-->0){
            String s[]=br.readLine().split(" ");
            int num=Integer.parseInt(s[0]);
            int x=Integer.parseInt(s[1]);
            int y=Integer.parseInt(s[2]);
            if(num==1){
                int temp=(x^lastans)%n;
                // getting sub arraylist with index equals to temp and then adding the value of y in it.
                al.get(temp).add(y);
            }
            else{
                int temp=(x^lastans)%n;
                // finsing size of sub arraylist
                int a1=al.get(temp).size();
                // finding integer stored at index in the subarraylist of index equals to temp
                lastans=al.get(temp).get(y%a1);
                //print statement
                System.out.println(lastans);
            }
        }
    }
}