/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;
import java.util.Scanner;
/**
 *
 * @author mukul goyal
 */
public class GameOfThrones1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String ans = "YES";
        char word[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int count[] = new int[26];
        char a[] = inputString.toCharArray();
        int l  = inputString.length();
        int c=0;
        for(int i=0;i<26;i++){
            for(int j=0;j<l;j++){
                if(word[i]==a[j])
                    count[i]++;
            }
            if(count[i]%2!=0)
                c++;
            if(c>1){
                ans = "NO";
                break;
            }
        }
        System.out.println(ans);
    }
}
