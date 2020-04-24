package softwareii;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class mainScreenController {
    //Added for table population
    @FXML
    TableView<Product> productTable;
    //end
    
    @FXML
    private TableColumn<?, ?> partIDCol;

    @FXML
    private TableColumn<?, ?> partNameCol;

    @FXML
    private TableColumn<?, ?> InvLevelCol;

    @FXML
    private TableColumn<?, ?> partCostCol;

    @FXML
    private TextField partSearchField;

    @FXML
    private Button partSearchBtn;

    @FXML
    private Button partAddBtn;

    @FXML
    private Button partModifyBtn;

    @FXML
    private Button partDeleteBtn;

    @FXML
    private TableColumn<?, ?> productIDCol;

    @FXML
    private TableColumn<?, ?> productNameCol;

    @FXML
    private TableColumn<?, ?> productLevelCol;

    @FXML
    private TableColumn<?, ?> productCostCol;

    @FXML
    private TextField productSearchField;

    @FXML
    private Button ProductSearchBtn;

    @FXML
    private Button productAddBtn;

    @FXML
    private Button productModifyBtn;

    @FXML
    private Button productDeleteBtn;
    
    @FXML
    private Button buttonExit;

    @FXML
    void handleButtonModPart(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;         
        stage=(Stage) partModifyBtn.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("modPart.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void handleButtonAddPart(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;         
        stage=(Stage) partAddBtn.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("addPart.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    
    }

    @FXML
    void handleButtonAddProd(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;         
        stage=(Stage) productAddBtn.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("addProduct.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void handleButtonDeletePart(ActionEvent event) {
        System.out.println("handleButtonDeletePart");
    }

    @FXML
    void handleButtonDeleteProd(ActionEvent event) {
        System.out.println("handleButtonDeleteProd");
    }

    @FXML
    void handleButtonModProd(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;         
        stage=(Stage) productModifyBtn.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("modProduct.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void handleButtonSearchPart(ActionEvent event) {
        System.out.println("handleButtonSearchPart");
    }

    @FXML
    void handleButtonSearchProd(ActionEvent event) {
        System.out.println("handleButtonSearchProd");
    }
    
    @FXML
    void handleButtonExit(ActionEvent event){
        System.exit(0);
    }

}
