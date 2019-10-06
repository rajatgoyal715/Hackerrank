import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
          Stack s = new Stack();
          String flag="true";
          label:
          for(int i=0;i<input.length();i++){
              char c=input.charAt(i);
              if(c=='{'||c=='('||c=='[')
                  s.push(c);
              else if(c=='}'){
                  if(s.isEmpty() || (char)s.pop()!='{'){
                      flag="false";
                      break label;
                  }
              }
              else if(c==']'){
                  if(s.isEmpty() || (char)s.pop()!='['){
                      flag="false";
                      break label;
                  }
              } 
              else if(c==')'){
                  if(s.isEmpty() || (char)s.pop()!='('){
                      flag="false";
                      break label;
                  }
              } 
          }
          if(!s.isEmpty())
              flag="false";
          System.out.println(flag);
      }
      
   }
}
