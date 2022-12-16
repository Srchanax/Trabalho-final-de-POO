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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tulpy
 */
public class LoginPageController implements Initializable {

    @FXML
    private Label lUser;
    @FXML
    private PasswordField txtSenha;
    @FXML
    private Label lPass;
    @FXML
    private TextField txtUsuario;
    @FXML
    private Button btnLogin;
    @FXML
    private Label labelForgot;
    
     @FXML
    void btnLogin(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("Options.fxml"));
                    stage.setScene(new Scene(root));
                    stage.setTitle("Options");
                    stage.show();
    }
    /**
     * Initializes the controller class.
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void ForgotPass(MouseEvent event) {
    }
    
}
