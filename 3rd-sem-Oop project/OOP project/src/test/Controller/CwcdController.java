/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import test.HeadOffice;

/**
 * FXML Controller class
 *
 * @author M.Ahsan
 */
public class CwcdController extends HeadOffice implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField brcode;

    @FXML
    private TextField acnumber;

    @FXML
    private TextField title;

    @FXML
    private TextField amount;

    @FXML
    private PasswordField pin;

    @FXML
    private Label check;
    
    @FXML
    private Button back;

    private String path2;

    @FXML
    void titleofaccount(ActionEvent event) {

    }

    @FXML
    void accountnumber(ActionEvent event) {

    }

    @FXML
    void branchcode(ActionEvent event) {

    }

    @FXML
    void pinnumber(ActionEvent event) {

    }
    
    @FXML
    void amount(ActionEvent event) {

    }

    @FXML
    private ChoiceBox<String> type;
    ObservableList<String> type1 = FXCollections.observableArrayList("Saving Account", "Current Account");

    @FXML
    void submit(ActionEvent event) {
        if (type.getValue().equals("Saving Account")) {
            path2 = "C:\\Users\\Hp\\Documents\\NetBeansProjects\\test_2\\src\\test\\savingaccount.txt";
        } else if (type.getValue().equals("Current Account")) {
            path2 = "C:\\Users\\Hp\\Documents\\NetBeansProjects\\test_2\\src\\test\\currentaccount.txt";
        }
        try {
            readBalance(title.getText(), Double.parseDouble(acnumber.getText()), Double.parseDouble(brcode.getText()), Integer.parseInt(pin.getText()), path2);
        } catch (IOException ex) {
            Logger.getLogger(ChbalanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (bal1.equals("0")) {
            check.setText("Incorrect Information");
        } else if (Double.parseDouble(bal1) < Double.parseDouble(amount.getText())) {
            check.setText("Insufficient Balance");
        } else {
            check.setText(Double.toString(Double.parseDouble(bal1) - Double.parseDouble(amount.getText())));
            try {
                updateBalance(title.getText(), Double.parseDouble(acnumber.getText()), Double.parseDouble(brcode.getText()), Integer.parseInt(pin.getText()), Double.parseDouble(amount.getText()), '-', path2);
            } catch (FileNotFoundException a) {
                System.out.println("File Not Found");
            } catch (IOException ex) {
                Logger.getLogger(CwcdController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @FXML
    void back(ActionEvent event){
        try {
            Stage stage=(Stage) back.getScene().getWindow();
            stage.close();
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("service.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage st = new Stage();
            st.setScene(new Scene(root1));
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(CwcdController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        type.setItems(type1);
    }
}
