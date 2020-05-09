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


import Interfaces.IDao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CalculateBilling implements IDao{
    
    public double taxpercent = 0.80;
    public double tea;
    public double coke;
    public double juice;
    public double coffee;
    public double espresso;
    public double icedcoffee;
    public double filtercoffee;
    public double manti;
    public double kebab;
    public double doner;
    public double chickensalad;
    public double lamb;
    public double steak;
    public double calves;
    public double cburger;
    public double dburger;
    public double chotdog;
    public double vhotdog;
    
    public double total;
    
    public double getTotal(){
        
        total = tea + coke + juice + coffee + espresso + icedcoffee + filtercoffee + manti + kebab + doner +chickensalad + lamb + steak + calves 
                + cburger + dburger + chotdog + vhotdog; 
        
        return total;
        
    }
    
    //override
    public double getTax(double taxes){
        
        double findTax = taxes - (taxes* taxpercent);
        return findTax;
    }

   
    
    
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
