public class Solution {    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        String s="^\\d{2}(-?)\\d{2}\\1\\d{2}\\1\\d{2}$";
        //String s="\\d{2}(-?)\\d{2}\\1";
        tester.checker(s); // Use \\ instead of using \ 
    
    }
}