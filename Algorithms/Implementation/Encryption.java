import java.util.Scanner;

public class Solution {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int l = s.length;
        char[] b = new char[l];
        int rows = (int) Math.floor(Math.sqrt(l));
        int columns = (int) Math.ceil(Math.sqrt(l));
        int min=0;
        int min1 = rows*columns;
        int min2 = rows*(columns-1);
        int min3 = (rows+1)*columns;
        if(min2<min1 && min2>=l){
            columns--;
            min = rows*columns;
        }
        else if(min1<min3 && min1>=l)
            min = rows*columns;
        else if(min3>=l){
            rows++;
            min = rows*columns;
        }
        for(int i=0;i<columns;i++){
            for(int j=i;j<l;j+=columns){
            if(s[j]!='\0')
                System.out.print(s[j]);
            }
            System.out.print(" ");
        }
    }
}