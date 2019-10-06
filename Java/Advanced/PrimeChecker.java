import static java.lang.System.*;
class Prime{
    public static void checkPrime(int ... num){
        int l = num.length;
        for(int i:num){
            if(prime(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }
    public static boolean prime(int num){
        if(num==1)
            return false;
        if(num==2||num==3)
            return true;
        if(num%2==0)
            return false;
        for(int i=3;i<=Math.sqrt(num);i+=2){
            if(num%i==0)
                return false;
        }
        return true;
    }
}