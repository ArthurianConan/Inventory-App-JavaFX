package softwareii;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class addProductController {

    @FXML
    private TextField iDTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField invTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private TextField maxTextField;

    @FXML
    private TextField minTextField;

    @FXML
    private Button searchTextField;

    @FXML
    private TableColumn<?, ?> IDAddCol;

    @FXML
    private TableColumn<?, ?> NameAddCol;

    @FXML
    private TableColumn<?, ?> InvAddCol;

    @FXML
    private TableColumn<?, ?> PriceAddCol;

    @FXML
    private Button addBtn;

    @FXML
    private TableColumn<?, ?> IDDeleteCol;

    @FXML
    private TableColumn<?, ?> nameDeleteCol;

    @FXML
    private TableColumn<?, ?> InvDeleteCol;

    @FXML
    private TableColumn<?, ?> priceDeleteCol;

    @FXML
    private Button deleteBtn;

    @FXML
    private Button saveBtn;

    @FXML
    private Button cancelBtn;
    
        @FXML
    void buttonAdd(ActionEvent event) {
        System.out.println("buttonAdd");
    }

    @FXML
    void buttonCancel(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;         
        stage=(Stage) cancelBtn.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void buttonDelete(ActionEvent event) {
        System.out.println("buttonDelete");
    }

    @FXML
    void buttonSave(ActionEvent event) throws IOException {
        //Create New Product Object
        Product thisProduct = new Product();
        thisProduct.setName(nameTextField.getText());
        thisProduct.setPrice(Double.parseDouble(priceTextField.getText()));
        thisProduct.setInstock(Integer.parseInt(invTextField.getText()));
        thisProduct.setMin(Integer.parseInt(minTextField.getText()));
        thisProduct.setMax(Integer.parseInt(maxTextField.getText()));
        
        thisProduct.productOutCheck();
        
        //Add Product to Data
        thisProduct.addProduct(thisProduct);
        
        //Return to Main Screen
        Stage stage; 
        Parent root;         
        stage=(Stage) cancelBtn.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        System.out.println("Saved!");
    }

    @FXML
    void buttonSearch(ActionEvent event) {
        System.out.println("buttonSearch");
    }

}
