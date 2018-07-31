import java.util.*;

/*
 * @author -- rajatgoyal715
 */
 
public class SeparateTheNumbers {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        
        label:
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            for(int i=1;i<s.length();i++){
                BigInteger initial = new BigInteger(s.substring(0,i));
                int pos = i;
                while(s.indexOf(initial.add(new BigInteger("1")).toString(),pos-1)==pos){
                    pos+=initial.add(new BigInteger("1")).toString().length();
                    initial = initial.add(new BigInteger("1"));
                }
                if(pos==s.length()){
                    System.out.println("YES "+s.substring(0,i));
                    continue label;
                }
            }
            System.out.println("NO");
        }
    }
}