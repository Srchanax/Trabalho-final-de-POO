/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Calc.IMCCalc;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author tulpy
 */
public class IMCController implements Initializable {

    @FXML
    private TextField tfAltura;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnCalcular;
    @FXML
    private MenuButton btnMenu;
    @FXML
    private MenuItem btnSH;
    @FXML
    private MenuItem btnSM;
    @FXML
    private TextField txPeso;
    @FXML
    private Label lAltura;
    @FXML
    private Label lPeso;
    @FXML
    private Label Res;
      @FXML
    private Button btnH;

    @FXML
    private Button btnM;

    Image k = new Image("file:k.png");
    Image e = new Image("file:e.png");
    DecimalFormat df = new DecimalFormat("0.0");
    /**
     * Initializes the controller class.
     */
    boolean h, m;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnLimpar(ActionEvent event) {
        tfAltura.setText("");
        txPeso.setText("");
        Res.setText("");
    }

    @FXML
    private void Calcular(ActionEvent event) {
        double alt = Double.parseDouble(this.tfAltura.getText());
        double peso = Double.parseDouble(this.txPeso.getText());
        IMCCalc calc = new IMCCalc(alt, peso);
        double res = calc.calc();
        if(h & m == false){
            if( 20 > res){
                Res.setText("seu IMC é "+ df.format(res));
                label2.setText("seu peso está abaixo da média recomendada!");
            }
            else if(res >= 20 & res <= 24.9){
                Res.setText("seu IMC é "+ df.format(res));
                label2.setText("seu peso está na média recomendada!");
            }
            else if(res >= 25 & res <= 29.9){
                Res.setText("seu IMC é "+ df.format(res));
                label2.setText("seu peso está um pouco da média recomendada!");
            }
            else if(res >= 30  & res <= 39.9){
                Res.setText("seu IMC é "+ df.format(res));
                label2.setText("seu peso está acima da média recomendada!");
            }
            else{
                Res.setText("seu IMC é "+ df.format(res));
                label2.setText("seu peso está bem acima da média recomendada!");
            }
        }
        else{
            if( 19 > res){
                Res.setText("seu IMC é "+ df.format(res));
                label2.setText(" seu peso está abaixo da média recomendada!");
            }
            else if(res >= 19 & res <= 23.9){
                Res.setText("seu IMC é "+ df.format(res));
                label2.setText(" seu peso está na média recomendada!");
            }
            else if(res >= 24 & res <= 28.9){
                Res.setText("seu IMC é "+ df.format(res));
                label2.setText(" seu peso está um pouco da média recomendada!");
            }
            else if(res >= 29  & res <= 38.9){
                Res.setText("seu IMC é "+ df.format(res));
                label2.setText(" seu peso está acima da média recomendada!");
            }
            else{
                Res.setText("seu IMC é "+ df.format(res));
                label2.setText(" seu peso está bem acima da média recomendada!");
            }
        }
        
    }

    @FXML
    private void btnH(ActionEvent event) {
        h = true;
        m = false;
        
        
    }

    @FXML
    private void btnM(ActionEvent event) {
        m = true;
        h = false; 
    }
    
}
