import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    static int get(Map<Integer, Integer> map, int key) {
        return map.getOrDefault(key, 0);
    }

    static void increaseFreq(Map<Integer, Integer> freqMap, int key) {
        int value = get(freqMap, key);
        freqMap.put(key, value+1);
    }

    static void decreaseFreq(Map<Integer, Integer> freqMap, int key) {
        int value = get(freqMap, key);
        freqMap.put(key, Math.max(value-1, 0));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        int type, num;
        String[] s;

        Map<Integer, Integer> numFreqMap = new HashMap<>();
        Map<Integer, Integer> countFreqMap = new HashMap<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<q;i++) {
            s = br.readLine().split(" ");
            type = Integer.parseInt(s[0]);
            num = Integer.parseInt(s[1]);
            if(type == 1) {
                int freq = get(numFreqMap, num);
                increaseFreq(numFreqMap, num);
                decreaseFreq(countFreqMap, freq);
                increaseFreq(countFreqMap, freq+1);
            } else if (type == 2) {
                int freq = get(numFreqMap, num);
                decreaseFreq(numFreqMap, num);
                decreaseFreq(countFreqMap, freq);
                increaseFreq(countFreqMap, freq-1);
            } else {
                sb.append(get(countFreqMap, num) > 0 ? "1\n" : "0\n");
            }
        }
        System.out.println(sb.toString());
    }
}
