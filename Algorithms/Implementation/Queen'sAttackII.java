import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rq = in.nextInt();
        int cq = in.nextInt();
        int e=n-cq, north=n-rq, w=cq-1, s=rq-1;
        int ne=Math.min(north,e), se = Math.min(s,e), nw = Math.min(north,w), sw = Math.min(s,w);
        for(int a0 = 0; a0 < k; a0++){
            int ro = in.nextInt();
            int co = in.nextInt();
            int r = ro-rq;
            int c = co-cq;
            if(r==0) {
                if(c>0){
                    if(c-1<e){
                        e = c-1;
                    }
                } else {
                    if(-c-1<w){
                        w = -c-1;
                    }
                }
            } else if(c==0) {
                if(r>0) {
                    if(r-1<north){
                        north = r-1;
                    }
                } else {
                    if(-r-1<s){
                        s = -r-1;
                    }
                }
            } else if(r==c) {
                if(r>0){
                    if(r-1<ne){
                        ne = r-1;
                    }
                } else {
                    if(-r-1<sw){
                        sw = -r-1;
                    }
                }
            } else if(r==-c) {
                if(r>0){
                    if(r-1<nw){
                        nw = r-1;
                    }
                } else {
                    if(-r-1<se){
                        se = -r-1;
                    }
                }
            }
        }
        int count = e+ne+north+nw+w+s+se+sw;
        System.out.println(count);
    }
}
