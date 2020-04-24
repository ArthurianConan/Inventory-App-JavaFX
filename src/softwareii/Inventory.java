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
public class Inventory {
    
    //Initialize Fields
    ArrayList<Product> listProducts = new ArrayList<>();
    
    public void addProduct(Product newProduct){
        //Adds Product to Arraylist
        listProducts.add(newProduct);
        System.out.println("product added to data!");
    }
    
//    public Product lookupProduct(){
//        return Product;
//    }
//    
//    public int updateProduct(){
//    
//    }
}
