import java.util.Scanner;
/**
 *
 * @author mukul goyal
 */
public class timeconversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        String time1[] = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
        String time2[] = {" o' clock","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve",
            "thirteen","fourteen","fivteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four",
            "twenty five","twenty six","twenty seven","twenty eight","twenty nine","half past "};
        String output="";
        if(num1!=0)
            output = time1[num1-1];
        if(num2==0)
            output = output + time2[num2];
        else if(num2<30){
            if(num2==15)
                output = "quarter past " + output;
            else
                output = time2[num2] + ((num2==1)?" minute ":" minutes ") + "past " + output;
        }
        else if(num2==30)
            output = time2[num2] + output;
        else if(num2>30){
            if(num2==45)
                output = "quarter to " + time1[num1];
            else
                output = time2[60-num2] + ((num2==59)?" minute ":" minutes ") + "to " + time1[num1];
        }
        System.out.println(output);
    }
}