import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class FindTheRunningMedian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        PriorityQueue<Double> small = new PriorityQueue<>(1, Collections.reverseOrder());
        PriorityQueue<Double> large = new PriorityQueue<>(1);

        StringBuilder sb = new StringBuilder();
        double num, ans;
        DecimalFormat df = new DecimalFormat("#.0");
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(sc.nextLine());
            if(small.isEmpty() || (num < small.peek())) small.add(num);
            else if(large.isEmpty() || (num > large.peek())) large.add(num);
            else small.add(num);

            while(small.size() > large.size()+1) {
                large.add(small.poll());
            }

            while(large.size() > small.size()) {
                small.add(large.poll());
            }

            if(small.size() == large.size()) ans = (small.peek() + large.peek())/2;
            else if(small.size() < large.size()) ans = large.peek();
            else ans = small.peek();

            sb.append(df.format(ans)+"\n");
        }

        System.out.println(sb.toString());

        sc.close();
    }
}
