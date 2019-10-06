/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

    void decode(String S ,Node root)
    {
        StringBuilder ans = new StringBuilder();
        int i=0;
        while(i<S.length()){
            Node temp = root;
            while(i<S.length() && temp!=null){
                char c = S.charAt(i);
                if(c == '1'){
                    temp = temp.right;
                } else if(c == '0') {
                    temp = temp.left;
                }
                if(temp.left == null && temp.right == null){
                    ans.append(temp.data);
                    break;
                }
                i++;
            }
            i++;
        }
        System.out.println(ans.toString());
    }
