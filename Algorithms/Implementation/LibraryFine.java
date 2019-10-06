import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ad = s.nextInt();
        int am = s.nextInt();
        int ay = s.nextInt();
        int ed = s.nextInt();
        int em = s.nextInt();
        int ey = s.nextInt();
        if(ay>ey)
            System.out.println(10000);
        else if(ay==ey){
            if(am>em)
                System.out.println(500*(am-em));
            else if(am==em){
                if(ad>ed)
                    System.out.println(15*(ad-ed));
                else
                    System.out.println(0);
            }
            else
                System.out.println(0);
        }
        else
            System.out.println(0);
    }
}