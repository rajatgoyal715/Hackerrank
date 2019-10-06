import java.util.Scanner;

public class Solution {
public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=1;
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(t + " " + s);
            t++;
        }
    }
}