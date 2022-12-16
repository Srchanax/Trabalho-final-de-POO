

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author tulpy
 */
public class CalculadoraController implements Initializable {
    
    @FXML
    private TextField tfVisor;
    @FXML
    private Button btnAC;
    @FXML
    private Button btn7;
    @FXML
    private Button btn4;
    @FXML
    private Button btn1;
    @FXML
    private Button btn0;
    @FXML
    private Button btnC;
    @FXML
    private Button btn8;
    @FXML
    private Button btn5;
    @FXML
    private Button btn2;
    @FXML
    private Button btnP;
    @FXML
    private Button btnPc;
    @FXML
    private Button btn9;
    @FXML
    private Button btn6;
    @FXML
    private Button btn3;
    @FXML
    private Button btnR;
    @FXML
    private Button btnD;
    @FXML
    private Button btnM;
    @FXML
    private Button btnS;
    @FXML
    private Button btnA;

    /**
     * Initializes the controller class.
     */
    
    double v1 = 0;
    double v2 = 0;
    double v3 = 0;
    double res = 0;
    String operacao;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tfVisor.setText(tfVisor.getText() + "1");
            }               
        });
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              
                    tfVisor.setText(tfVisor.getText() + "2");
               
                
            }               
        });
        
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tfVisor.setText(tfVisor.getText() + "3");
            }               
        });
        
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tfVisor.setText(tfVisor.getText() + "4");
            }               
        });
        
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tfVisor.setText(tfVisor.getText() + "5");
            }               
        });
        
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tfVisor.setText(tfVisor.getText() + "6");
            }               
        });
        
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tfVisor.setText(tfVisor.getText() + "7");
            }               
        });
        
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tfVisor.setText(tfVisor.getText() + "8");
            }               
        });
        
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tfVisor.setText(tfVisor.getText() + "9");
            }               
        });
        
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tfVisor.setText(tfVisor.getText() + "0");
            }               
        });
        
        btnA.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                /*if( v1 == 0){*/
                    v1 = Double.parseDouble(tfVisor.getText());
                    tfVisor.setText("");
                    operacao = "+";
                /*}
                else{
                    v2 = Double.parseDouble(tfVisor.getText());
                    tfVisor.setText("");
                    res = v2 + v3;
                    tfVisor.setText(String.valueOf(res));
                }*/
                
            }               
        });
        
        btnS.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                v1 = Double.parseDouble(tfVisor.getText());
                tfVisor.setText("");
                operacao = "-";
            }               
        });
        
        btnM.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                v1 = Double.parseDouble(tfVisor.getText());
                tfVisor.setText("");
                operacao = "*";
            }               
        });
        
        btnD.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                v1 = Double.parseDouble(tfVisor.getText());
                tfVisor.setText("");
                operacao = "/";
            }               
        });
        
        btnAC.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                v1 = 0;
                v2 = 0;
                v3 = 0;
                res = 0;
                tfVisor.setText("");
            }               
        });
        
        btnC.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                tfVisor.setText(tfVisor.getText().substring(0, tfVisor.getText().length() - 1));
            }               
        });
        
        btnR.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                v2 = Double.parseDouble(tfVisor.getText());
                
                switch(operacao){
                    case "+" :
                        res = v1 + v2;
                        tfVisor.setText(String.valueOf(res));
                        break;
                    case "-" :
                        res = v1 - v2;
                        tfVisor.setText(String.valueOf(res));
                        break;
                    case "*" :
                        res = v1 * v2;
                        tfVisor.setText(String.valueOf(res));
                        break;
                    case "/" :
                        res = v1 / v2;
                        tfVisor.setText(String.valueOf(res));
                        break;    
                }
                
            }               
        });
        
        
    }
}
    

