import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []argh)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        
        // input
        for(int i=0;i<n;i++)
            s[i]=sc.next();
        
        // lambda expressions
        Arrays.sort( s, (as,bs) -> {BigDecimal bd1 = new BigDecimal(bs); 
        return bd1.compareTo(new BigDecimal(as));} );
        
        // output
        for(int i=0;i<n;i++)
            System.out.println(s[i]);
    }
}
