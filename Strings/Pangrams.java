/*
 *  Add any license header using tools << templates << licenses << default license
 */

package Strings;

import java.util.Scanner;

/**
 * @author mukul goyal
 */

public class Pangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s = s1.toLowerCase();
        int flag=0;
        int l = s.length();
        for(int i=0;i<26;i++){
            flag=0;
            for(int j=0;j<l;j++){
                if(s.charAt(j)==97+i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0)
                break;
        }
        System.out.println((flag==1)?"pangram":"not pangram");
    }
}
