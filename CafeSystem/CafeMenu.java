/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeSystem;

/**
 *
 * @author yaseminturhan
 */
public class CafeMenu implements Comparable<CafeMenu>{
    
 
    public String id;
    public String type;
    public String description;
  
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public CafeMenu(String id, String type, String description){
        this.id = id;
        this.type = type;
        this.description = description;
        
    }
    
    public CafeMenu(){
        
    }

 

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return id + "___" + type + "___" + description + "___";
    }


    @Override
    public int compareTo(CafeMenu o) {
        return Integer.valueOf(this.getId()).compareTo(Integer.valueOf(o.getId()));
    }
 
    
    
}