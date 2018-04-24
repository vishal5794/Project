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

/**
 * FXML Controller class
 *
 * @author Vish
 */
public class JackpotCombinationsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    Button b=new Button();
    
    @FXML
    public void backGame(){
        Project.showGameWindow();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
