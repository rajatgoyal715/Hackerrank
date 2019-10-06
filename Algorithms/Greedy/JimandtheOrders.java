import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        String s[]=new String[n+1];
        //Map<Key, Value>
        //key is a[i]
        //value is index
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt()+sc.nextInt();
            s[i+1]=(i+1)+" ";
            if(map.get(a[i])!=null){
                s[i+1]=s[map.get(a[i])]+s[i+1];
            }
            map.put(a[i], i+1);
        }
        Set set = map.entrySet();
        Iterator i= set.iterator();
        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            int t2=(int)me.getValue();
            System.out.print(s[t2]);
        }
    }
}