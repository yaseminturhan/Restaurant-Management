/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import CafeSystem.CafeMenu;
import java.util.List;

/**
 *
 * @author yaseminturhan
 */
public interface MenuInterface extends CrudInterfaces<CafeMenu> {
    
    
    List<CafeMenu> getByDrink(String drinks);
    List<CafeMenu> getByFood(String foods);
}
 