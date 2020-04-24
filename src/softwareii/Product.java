/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareii;

import java.util.ArrayList;

/**
 *
 * @author peterlanier
 */
public class Product extends Inventory {
    
    //initialize fields
    static ArrayList<Part> listMasterParts = new ArrayList<>();
    private ArrayList<Part> listAssociatedParts = new ArrayList<>();
    static int productCounter = 0;
    private int productID = productCounter;
    private String name;
    private double price;
    private int instock;
    private int min;
    private int max;
    
    // the constructor
//    public Product(String name, double price, int instock, int min, int max) {
//        this.productID = instanceCounter;
//        instanceCounter++;
//        this.name = name;
//        this.price = price;
//        this.instock = instock;
//        this.min = min;
//        this.max = max;
//    }
    
    public Product(){
        productCounter++;
    }
    
    public void productOutCheck(){
        System.out.println("Check " + productID
        + " " + name        
        + " " + price
        + " " + instock
        + " " + min
        + " " + max);
    }

    //Methods: SETTERS
    public void setName(String newValue) {
        name = newValue;
    }
        
    public void setPrice(double newValue) {
        price = newValue;
    }
        
    public void setInstock(int newValue) {
        instock = newValue;
    }
    
    public void setMin(int newValue){
        min = newValue;
    }
    
    public void setMax(int newValue){
        max = newValue;
    }
    
    //Methods GETTERS
    public int getProductID() {
        return productID;
    }
    
    public String getName(){
        return name;
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
    
    //Methods: PARTS
    public void addPart(){
//        loop(){
//            try(){}
//            catch(){}
//        
//        }
    }
    
    public void removePart(){
    
    }
    
    
    
//    public int lookupPart(){
//        
//    }
//    
//    public int updatePart(){
//    
//    }
    
    public void newOut(Outsourced newPart){
        //Adds Part to Master List
        listMasterParts.add(newPart);
        System.out.println("outsourced part added to data!");
    }

    public void newIn(Inhouse newPart){
        //Adds Part to Master List
        listMasterParts.add(newPart);
        System.out.println("inhouse part added to data!");
    }
    
}
