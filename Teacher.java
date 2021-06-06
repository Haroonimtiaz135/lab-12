
package lab.pkg12;
import java.util.Scanner;


public class Teacher extends Person implements Association {
    
    public String designation;
    public String department;
    
    void associate(){
        System.out.println("designation : ");
        Scanner x = new Scanner(System.in);
       this.designation = x.nextLine();
       System.out.println("department : ");
       Scanner y = new Scanner(System.in);
       this.department = y.nextLine(); 
    }
    
    public Teacher(String name, String id){
        super(name, id);
    }
    
    @Override
    public String toString(){
       return super.toString()+" designation :"+designation+" department :"+department;
   }
    
}
