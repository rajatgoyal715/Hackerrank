package Implementation;

import java.util.Scanner;

/*
 * @author -- rajatgoyal715
 */

public class SherlockAndSquares {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println((int)(Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a))+1));
            t--;
        }
    }
}
