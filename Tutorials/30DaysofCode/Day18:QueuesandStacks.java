public class Solution {
    Stack stack = new Stack();
    //Queue<Character> queue = new Queue<Character>();
    LinkedList ll = new LinkedList();
    void pushCharacter(char ch){
        stack.push(ch);
    }
    char popCharacter(){
        return (char)stack.pop();
    }
    void enqueueCharacter(char ch){
        ll.add(ch);
    }
    char dequeueCharacter(){
        return (char)ll.remove();
    }