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
import CafeSystem.TableOrder;
import CafeSystem.CalculateBilling;

import java.util.List;

public interface IDao {
    
    //public double getSubTotal();
    public double getTotal();
    public double getTax(double taxes);
    
    public double teanum= 1.0;
    public double cokenum = 5.0;
    public double juicenum = 5.0;
    public double coffeenum = 10.00;
    public double espressonum= 8.00;
    public double icedcoffeenum= 13.00;
    public double filtercoffeenum = 9.00;
    public double mantinum = 16.00;
    public double kebabnum = 19.00;
    public double donernum = 14.00;
    public double chickensaladnum= 15.00;
    public double lambnum =19.00;
    public double steaknum = 31.00;
    public double calvesnum = 17.00;
    public double cburgernum= 14.00;
    public double dburgernum= 19.00;
    public double chotdognum = 9.00;
    public double vhotdognum = 10.00;

}

