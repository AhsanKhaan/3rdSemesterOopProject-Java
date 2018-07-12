/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author M.Ahsan
 */
public class serviceController {

    @FXML
    private Label label;

    @FXML
    private Button wd_button;

    @FXML
    private Button dep_button;

    @FXML
    private Button newac_button;

    @FXML
    private Button mpro_button;

    @FXML
    private Button other_button;
    
    @FXML
    private Button exit;

    @FXML
    void cashdeposit(ActionEvent event) throws IOException {
        Stage stage=(Stage) dep_button.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("cwcd1.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage st = new Stage();
        st.setScene(new Scene(root1));
        st.show();
    }

    @FXML
    void monthlyprofit(ActionEvent event) throws IOException {
        Stage stage=(Stage) mpro_button.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("Profit.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage st = new Stage();
        st.setScene(new Scene(root1));
        st.show();
    }

    @FXML
    void newaccount(ActionEvent event) throws IOException {
        Stage stage=(Stage) newac_button.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("new1.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage st = new Stage();
        st.setScene(new Scene(root1));
        st.show();
    }

    @FXML
    void others(ActionEvent event) throws IOException {
        Stage stage=(Stage) other_button.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("Others.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage st = new Stage();
        st.setScene(new Scene(root1));
        st.show();
    }

    @FXML
    void withdrawl(ActionEvent event) throws IOException {
        Stage stage=(Stage) wd_button.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("cwcd.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage st = new Stage();
        st.setScene(new Scene(root1));
        st.show();
    }
    
    @FXML
    void exit(ActionEvent event) {
        try {
            Stage stage=(Stage) exit.getScene().getWindow();
            stage.close();
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage st = new Stage();
            st.setScene(new Scene(root1));
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(serviceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
};
