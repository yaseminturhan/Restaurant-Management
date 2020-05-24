/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import CafeSystem.CafeMenu;
import Interfaces.MenuInterface;
import Model.FileModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yaseminturhan
 */
public class OrderService extends FileModel implements MenuInterface{
    
    private static final String FILE_NAME= "userorder.txt";
   
    

    @Override
    public void save(CafeMenu items) {
        int id = super.getLastId(FILE_NAME);
        items.setId(String.valueOf(id));
        super.writeFile(FILE_NAME,items.toString());
    }

    @Override
    public void save(CafeMenu items, String id) {
         items.setId(id);
         super.writeFile(FILE_NAME, items.toString());
    }

    @Override
    public void update(String id, CafeMenu items) {
        String temp =id;
        delete(id);
        this.save(items,temp); 
    }

    @Override
    public void delete(String id) {
        super.deleteLine(FILE_NAME, id);
    }

    @Override
    public List<CafeMenu> getAll() {
        
        List<String> lines = super.readLines(FILE_NAME);   
        return alltoMenu(lines);
    }
    
   public List<CafeMenu> alltoMenu(List<String> lines){
        List<CafeMenu> items = new ArrayList<>();
        for(String line : lines){
            String[] datas = line.split("___");
            CafeMenu item = new CafeMenu(
                    
                    datas[0],
                    datas[1],
                    datas[2]
                  
                   
                    
            );        
            items.add(item);
        }
        return items;
    }
   
   public CafeMenu toMenu(String line){
        String[] datas = line.split("___");
        return new CafeMenu(
                datas[0],
                datas[1],
                datas[2]
             
        ); 
        
    }

  

    @Override
    public CafeMenu getById(String id) {
        String line = super.readLineById(FILE_NAME, id);
        return toMenu(line); 
    }

    @Override
    public List<CafeMenu> getByDrink(String drinks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CafeMenu> getByFood(String foods) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}


