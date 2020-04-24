package softwareii;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class addPartController {

    @FXML
    private RadioButton inRadio;

    @FXML
    private RadioButton outRadio;

    @FXML
    private Button SaveBtn;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField InTextField;

    @FXML
    private TextField maxTextField;

    @FXML
    private TextField minTextField;

    @FXML
    private TextField costTextField;

    @FXML
    private TextField compTextField;

    @FXML
    private Label partIDLabel;

    @FXML
    private TextField MachIDTextField;
    
    @FXML
    private Label machIDLabel;
            
    @FXML
    private Label compNameLabel;

    @FXML
    void buttonCancel(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;         
        stage=(Stage) cancelButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void buttonSave(ActionEvent event) throws IOException {
        //Add New Object Depending on Type
        if (inRadio.isSelected()){
            Inhouse thisPart = new Inhouse();
            thisPart.setName(nameTextField.getText());
            thisPart.setPrice(Double.parseDouble(costTextField.getText()));
            thisPart.setInstock(Integer.parseInt(InTextField.getText()));
            thisPart.setMin(Integer.parseInt(minTextField.getText()));
            thisPart.setMax(Integer.parseInt(maxTextField.getText()));
            thisPart.setMachineID(Integer.parseInt(MachIDTextField.getText()));
            //Add Inhouse Part to Masterlist
            thisPart.newIn(thisPart);
            thisPart.partCheck();
        } else if (outRadio.isSelected()){
            Outsourced thisPart = new Outsourced();
            thisPart.setName(nameTextField.getText());
            thisPart.setPrice(Double.parseDouble(costTextField.getText()));
            thisPart.setInstock(Integer.parseInt(InTextField.getText()));
            thisPart.setMin(Integer.parseInt(minTextField.getText()));
            thisPart.setMax(Integer.parseInt(maxTextField.getText()));
            thisPart.setCompanyName(compTextField.getText());
            //Add Outsourced Part to Masterlist
            thisPart.newOut(thisPart);
            thisPart.partCheck();
        }
        
        //Save to Data
        
        
        //Return To Main Screen
        Stage stage; 
        Parent root;         
        stage=(Stage) cancelButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void radioIn(ActionEvent event) {
        compTextField.setVisible(false);
        compNameLabel.setVisible(false);
        MachIDTextField.setVisible(true);
        machIDLabel.setVisible(true);

    }

    @FXML
    void radioOut(ActionEvent event) {
        compTextField.setVisible(true);
        compNameLabel.setVisible(true);
        MachIDTextField.setVisible(false);
        machIDLabel.setVisible(false);
    }

}
