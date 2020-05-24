/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author yaseminturhan
 */


public interface IDao {
    
    //public double getSubTotal();
    public double getTotal();
    public double getTax(double taxes);
    

}

