import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      //super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
        ArrayList<Student> a = new ArrayList<Student>();
      while(totalEvents>0){
         String event = in.next();
         switch(event){
           case "ENTER":
                String name=in.next();
                double cgpa =in.nextDouble();
                int token=in.nextInt();
                Student s = new Student(token,name,cgpa);
                a.add(s);
                break;
             case "SERVED":
                if(a.size()==0){
                    break;
                }
                    
                double max_cgpa=0;
                 int index=0;
                    for(int i=0;i<a.size();i++){
                        if(a.get(i).getCgpa()>=max_cgpa){
                            max_cgpa = a.get(i).getCgpa();
                            index=i;
                        }
                    }
                 for(int i=0;i<index;i++){
                     if(a.get(i).getCgpa()==max_cgpa){
                         if(a.get(i).getFname().compareTo(a.get(index).getFname())<0)
                             index=i;
                         else if(a.get(i).getFname().compareTo(a.get(index).getFname())==0){
                             if(a.get(i).getToken()<a.get(index).getToken())
                                 index=i;
                         }
                     }
                 }
                 a.remove(index);
                break;
         }
         totalEvents--;
      }
        if(a.size()==0)
            System.out.println("EMPTY");
          else{
        while(a.size()!=0){
        double max_cgpa=0;
        int index=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i).getCgpa()>=max_cgpa){
                max_cgpa = a.get(i).getCgpa();
                index=i;
            }
        }
        for(int i=0;i<index;i++){
            if(a.get(i).getCgpa()==max_cgpa){
                if(a.get(i).getFname().compareTo(a.get(index).getFname())<0)
                    index=i;
                else if(a.get(i).getFname().compareTo(a.get(index).getFname())==0){
                    if(a.get(i).getToken()<a.get(index).getToken())
                        index=i;
                }
            }
        }
            System.out.println(a.get(index).getFname());
        a.remove(index);
        }
          }
    }
}
