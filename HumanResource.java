
package lab.pkg12;
import java.util.ArrayList;

public class HumanResource {
    
    public Association[] resources;
    
    public void add(Association obj){
        resources[resources.length-1] = obj;
        
    }
    
    public boolean delete(Association index){
        
        for (int i=0; i<resources.length+1; i++){
            if (resources[i].equals(index)){
                resources.remove(index);
                return true;
            }
            
        }
        return false;
        
    }
    
    @Override 
    public String toString(){
        String x= " ";
        for (int i=0;i<resources.length+1; i++){
            x += resources.get(i)+ " \n";
        }
        return x;
    }
    
    private void extend(){
        Association[] a = new Association [resources.length+1];
        
    }
    
}
