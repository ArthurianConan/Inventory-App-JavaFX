/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareii;

/**
 *
 * @author peterlanier
 */
public abstract class Part extends Product {
    //initialize fields
    static int partCounter = 0;
    private int partID = partCounter;
    private String name;
    private double price;
    private int instock;
    private int min;
    private int max;
    
    //the constructor
    public Part(){
    partCounter++;
    }
    
    
    
    public void partCheck(){
        System.out.println("Check " + partID
        + " " + name        
        + " " + price
        + " " + instock
        + " " + min
        + " " + max);
    }
    
    //Methods: SETTERS
    public void setName(String newValue){
        name = newValue;
    }
    
    public void setPrice(double newValue){
        price = newValue;
    }
    
    public void setInstock(int newValue){
        instock = newValue;
    }
    
    public void setMin(int newValue){
        min = newValue;
    }
    
    public void setMax(int newValue){
        max = newValue;
    }
    
    //Methods: GETTERS
    public String getName(){
        return name;
    }
    
    public int getPartID(){
        return partID;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getInstock(){
        return instock;
    }
    
    public int getMin(){
        return min;
    }
    
    public int getMax(){
        return max;
    }
    
}
