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
import javafx.scene.control.TextField;

/**
 *
 * @author Vish
 */
public class StartGameController implements Initializable {

    @FXML
    private Label name;

    @FXML
    private Label enterName;

    @FXML
    private TextField getName;

    @FXML
    private Button startGame;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void startGame() {
        LogicClass.userName = getName.getText();
        Project.showGameWindow();
        getName.clear();
    }

    public void onLoad() {
        name.setText(LogicClass.userName);
    }
}
