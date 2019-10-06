import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
            BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(x.readLine());
            Double y = Double.parseDouble(x.readLine());
            String s = x.readLine();
        
            System.out.println("String: " + s);
            System.out.println("Double: " + y);
            System.out.println("Int: " + a);
    }
}
