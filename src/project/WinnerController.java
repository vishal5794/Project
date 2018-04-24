/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Vish
 */
public class WinnerController implements Initializable {

    @FXML
    Label name=new Label();
    
    @FXML
    Label l=new Label();
    
    @FXML
    Label prize=new Label();
    
    @FXML
    Button playBack=new Button();
    
    @FXML
    public void goStartWindow(){
        Project.showStartWindow();
    }
    
    @FXML
    public void showPrize(){
        name.setText(LogicClass.userName);
        prize.setText(String.valueOf(LogicClass.defaultAmount));
        LogicClass.userName="";
        LogicClass.defaultAmount=100;
    }
    
    public void onLoad() {
        name.setText(LogicClass.userName);
        prize.setText(String.valueOf(LogicClass.defaultAmount));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
