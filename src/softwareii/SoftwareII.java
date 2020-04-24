/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareii;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author peterlanier
 */
public class SoftwareII extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        System.out.println("Made it here");
        
        
        
        //populate data for program
        Inhouse data1 = new Inhouse();
        data1.setName("Chain");
        data1.setPrice(5.00);
        data1.setInstock(7);
        data1.setMin(2);
        data1.setMax(10);
        data1.setMachineID(22435);
        data1.newIn(data1);
        
        Outsourced data2 = new Outsourced();
        data2.setName("Shifter");
        data2.setPrice(35.00);
        data2.setInstock(13);
        data2.setMin(1);
        data2.setMax(29);
        data2.setCompanyName("Shimano");
        data2.newOut(data2);
        
        Inhouse data3 = new Inhouse();
        data3.setName("Spoke");
        data3.setPrice(19.00);
        data3.setInstock(8);
        data3.setMin(1);
        data3.setMax(11);
        data3.setMachineID(8893);
        data3.newIn(data3);
        
        Outsourced data4 = new Outsourced();
        data4.setName("Frame");
        data4.setPrice(299.00);
        data4.setInstock(40);
        data4.setMin(20);
        data4.setMax(60);
        data4.setCompanyName("AWT");
        data4.newOut(data4);
        
        Product data5 = new Product();
        data5.setName("Trek Men's Bike");
        data5.setPrice(2000.00);
        data5.setInstock(8);
        data5.setMin(5);
        data5.setMax(25);
        data5.addProduct(data5);
        
        Product data6 = new Product();
        data6.setName("Trek Women's Bike");
        data6.setPrice(1500.00);
        data6.setInstock(21);
        data6.setMin(5);
        data6.setMax(25);
        data6.addProduct(data6);
        

        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    
    
    
    }
    
}
