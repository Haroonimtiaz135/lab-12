
package lab.pkg12;
import java.util.Scanner;

public class Student extends Person implements Association{
    
    public int rollNo;
    public int semester;
    
   void associate(){
       System.out.println("roll no : ");
       Scanner x = new Scanner(System.in);
       this.rollNo = x.nextInt();
       System.out.println("semester : ");
       Scanner y = new Scanner(System.in);
       this.semester = x.nextInt();   
        
    }
   
   public Student(String name, String id){
       
       super(name, id);
       
   }
   
   @Override
   public String toString(){
       return super.toString()+" roll no: "+rollNo+" semester :"+semester;
   }
    
}
