/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tulpy
 */
public class OptionsController implements Initializable {

    @FXML
    private Button btnCalculadora;
    @FXML
    private Button btnIMC;
    @FXML
    private Label labelConfirm;
    @FXML
    void btnCalculadora(ActionEvent event) throws IOException {
        Stage stage1 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root;              
        root = FXMLLoader.load(getClass().getResource("Calculadora.fxml"));
        stage1.setScene(new Scene(root));
        stage1.setTitle("Calculadora");
        stage1.show();
    }
    @FXML
    void btnIMC(ActionEvent event) throws IOException {
        Stage stage1 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root;              
        root = FXMLLoader.load(getClass().getResource("IMC.fxml"));
        stage1.setScene(new Scene(root));
        stage1.setTitle("Calculadora");
        stage1.show();

    }
    

    
     int op; 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                
    }
}
