/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeSystem;

import Interfaces.IDao;

/**
 *
 * @author yaseminturhan
 */
public class PosPayment extends CafeItems implements IDao{
    
    public PosPayment(double taxpercent, double total){
        this.taxpercent = taxpercent;
        this.total = total; 
        
    }
    
    
}
