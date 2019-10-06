import java.io.*;
import java.util.*;

public class Contacts {

    static class Trie {
        int count;
        Trie[] children;

        public Trie() {
            children = new Trie[26];
        }

        void addWord(String word) {
            // System.out.println("Adding " + word);
            count++;
            if(word.isEmpty()) return;
            char first = word.charAt(0);
            if(children[first-'a'] == null){
                children[first-'a'] = new Trie();
            }
            children[first-'a'].addWord(word.substring(1));
        }

        int findWord(String word) {
            // System.out.println("Finding " + word);
            if(word.isEmpty()) return count;
            char first = word.charAt(0);
            if(children[first-'a'] == null) return 0;
            return children[first-'a'].findWord(word.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Trie trie = new Trie();
        StringBuilder res = new StringBuilder();

        String[] opContact = new String[2];
        String op, contact;
        int count;
        for (int nItr = 0; nItr < n; nItr++) {
            opContact = sc.nextLine().split(" ");
            op = opContact[0];
            contact = opContact[1];

            if (op.equals("add")) {
                trie.addWord(contact);
            } else {
                count = trie.findWord(contact);
                res.append(count + "\n");
            }
        }

        System.out.println(res.toString());

        sc.close();
    }
}
