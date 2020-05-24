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


public class CafeItems implements IDao{
    
   
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
        
        total = getTea() + getCoke() + getJuice() + getCoffee() + getEspresso() + getIcedcoffee() + getFiltercoffee() + getManti() + getKebab() + getDoner() +getChickensalad() + getLamb() + getSteak() + getCalves() 
                + getCburger() + getDburger() + getChotdog() + getVhotdog(); 
        
        return total;
        
    }
    
   
    public double getTax(double taxes){
        
        double findTax = taxes - (taxes* getTaxpercent());
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

  
    public double getTaxpercent() {
        return taxpercent;
    }

 
    public void setTaxpercent(double taxpercent) {
        this.taxpercent = taxpercent;
    }

 
    public double getTea() {
        return tea;
    }

    
    public void setTea(double tea) {
        this.tea = tea;
    }

 
    public double getCoke() {
        return coke;
    }

    
    public void setCoke(double coke) {
        this.coke = coke;
    }


    public double getJuice() {
        return juice;
    }

   
    public void setJuice(double juice) {
        this.juice = juice;
    }

  
    public double getCoffee() {
        return coffee;
    }

   
    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

   
    public double getEspresso() {
        return espresso;
    }


    public void setEspresso(double espresso) {
        this.espresso = espresso;
    }


    public double getIcedcoffee() {
        return icedcoffee;
    }

  
    public void setIcedcoffee(double icedcoffee) {
        this.icedcoffee = icedcoffee;
    }

    
    public double getFiltercoffee() {
        return filtercoffee;
    }

   
    public void setFiltercoffee(double filtercoffee) {
        this.filtercoffee = filtercoffee;
    }

  
    public double getManti() {
        return manti;
    }

   
    public void setManti(double manti) {
        this.manti = manti;
    }

  
    public double getKebab() {
        return kebab;
    }

   
    public void setKebab(double kebab) {
        this.kebab = kebab;
    }

    
    public double getDoner() {
        return doner;
    }

    
    public void setDoner(double doner) {
        this.doner = doner;
    }

   
    public double getChickensalad() {
        return chickensalad;
    }


    public void setChickensalad(double chickensalad) {
        this.chickensalad = chickensalad;
    }

  
    public double getLamb() {
        return lamb;
    }

    
    public void setLamb(double lamb) {
        this.lamb = lamb;
    }

   
    public double getSteak() {
        return steak;
    }

   
    public void setSteak(double steak) {
        this.steak = steak;
    }

  
    public double getCalves() {
        return calves;
    }

   
    public void setCalves(double calves) {
        this.calves = calves;
    }

   
    public double getCburger() {
        return cburger;
    }

   
    public void setCburger(double cburger) {
        this.cburger = cburger;
    }

    
    public double getDburger() {
        return dburger;
    }

   
 
    public void setDburger(double dburger) {
        this.dburger = dburger;
    }


    public double getChotdog() {
        return chotdog;
    }

  
    public void setChotdog(double chotdog) {
        this.chotdog = chotdog;
    }

   
    public double getVhotdog() {
        return vhotdog;
    }

  
    public void setVhotdog(double vhotdog) {
        this.vhotdog = vhotdog;
    }

    
    public void setTotal(double total) {
        this.total = total;
    }

    public double getTeanum() {
        return teanum;
    }

    

    public void setTeanum(double teanum) {
        this.teanum = teanum;
    }

   
    public double getCokenum() {
        return cokenum;
    }


    public void setCokenum(double cokenum) {
        this.cokenum = cokenum;
    }

   
    public double getJuicenum() {
        return juicenum;
    }

   
    public void setJuicenum(double juicenum) {
        this.juicenum = juicenum;
    }

   
    public double getCoffeenum() {
        return coffeenum;
    }

   
    public void setCoffeenum(double coffeenum) {
        this.coffeenum = coffeenum;
    }

   
    public double getEspressonum() {
        return espressonum;
    }

   
    public void setEspressonum(double espressonum) {
        this.espressonum = espressonum;
    }

   
    public double getIcedcoffeenum() {
        return icedcoffeenum;
    }

   
    public void setIcedcoffeenum(double icedcoffeenum) {
        this.icedcoffeenum = icedcoffeenum;
    }

   
    public double getFiltercoffeenum() {
        return filtercoffeenum;
    }

  
    public void setFiltercoffeenum(double filtercoffeenum) {
        this.filtercoffeenum = filtercoffeenum;
    }

    
    public double getMantinum() {
        return mantinum;
    }


    public void setMantinum(double mantinum) {
        this.mantinum = mantinum;
    }

   
    public double getKebabnum() {
        return kebabnum;
    }

 
    public void setKebabnum(double kebabnum) {
        this.kebabnum = kebabnum;
    }

 
    public double getDonernum() {
        return donernum;
    }

   
    public void setDonernum(double donernum) {
        this.donernum = donernum;
    }

    
    public double getChickensaladnum() {
        return chickensaladnum;
    }

   
    public void setChickensaladnum(double chickensaladnum) {
        this.chickensaladnum = chickensaladnum;
    }

   
    public double getLambnum() {
        return lambnum;
    }


    public void setLambnum(double lambnum) {
        this.lambnum = lambnum;
    }

    
    public double getSteaknum() {
        return steaknum;
    }

   
    public void setSteaknum(double steaknum) {
        this.steaknum = steaknum;
    }

    
    public double getCalvesnum() {
        return calvesnum;
    }

   
    public void setCalvesnum(double calvesnum) {
        this.calvesnum = calvesnum;
    }

    
    public double getCburgernum() {
        return cburgernum;
    }

   
    public void setCburgernum(double cburgernum) {
        this.cburgernum = cburgernum;
    }

    
    public double getDburgernum() {
        return dburgernum;
    }

    
    public void setDburgernum(double dburgernum) {
        this.dburgernum = dburgernum;
    }

   
    public double getChotdognum() {
        return chotdognum;
    }

  
    public void setChotdognum(double chotdognum) {
        this.chotdognum = chotdognum;
    }

   
    public double getVhotdognum() {
        return vhotdognum;
    }

    
    public void setVhotdognum(double vhotdognum) {
        this.vhotdognum = vhotdognum;
    }
    
     
    
    
    
    
    
}
