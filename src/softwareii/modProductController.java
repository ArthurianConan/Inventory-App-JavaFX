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

public class modProductController {

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

    }

    @FXML
    void buttonSave(ActionEvent event) {

    }

    @FXML
    void buttonSearch(ActionEvent event) {

    }

}
