/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
public class HighScoresController implements Initializable {

    @FXML
    Label highScore = new Label();
    @FXML
    Label name = new Label();
    @FXML
    Label score = new Label();
    @FXML
    Label $1 = new Label();
    @FXML
    Label $2 = new Label();

    @FXML
    Label name1 = new Label();
    @FXML
    Label name2 = new Label();
    @FXML
    Label name3 = new Label();
    @FXML
    Label name4 = new Label();
    @FXML
    Label name5 = new Label();
    @FXML
    Label name6 = new Label();
    @FXML
    Label name7 = new Label();
    @FXML
    Label name8 = new Label();

    @FXML
    Label score1 = new Label();
    @FXML
    Label score2 = new Label();
    @FXML
    Label score3 = new Label();
    @FXML
    Label score4 = new Label();
    @FXML
    Label score5 = new Label();
    @FXML
    Label score6 = new Label();
    @FXML
    Label score7 = new Label();
    @FXML
    Label score8 = new Label();
    
    @FXML
    Button backButton=new Button();

    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> scores = new ArrayList<>();

    GameWindowController g = new GameWindowController();

    
    public void readFromFile() {
        try {
            File file = new File("scorelist//scores.txt");
            FileReader fr = new FileReader(file.getAbsoluteFile());
            BufferedReader br = new BufferedReader(fr);

            String content;
            while ((content = br.readLine()) != null) {
                String[] parts = content.split(",");
                if (parts.length >= 2) {
                    String name = parts[0];
                    String score = parts[1];
                    names.add(name);
                    scores.add(score);
                }
            }

            for (int i = 0; i < names.size(); i++) {
            System.out.println("-----"+names.get(i));
            System.out.println("$$$$$"+scores.get(i)); 
            }
            
            name1.setText("Hello");
            score1.setText("How");
           
            
            
//            Close the file after we are done reading from it.
            br.close();
            System.out.println("Done");
            

        } catch (Exception ie) {
            System.out.println("Failed to Read");
        }
    }

    @FXML
    public void writeToFile() {
        Project.showGameWindow();
        try {

            File file = new File("scorelist//scores.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(LogicClass.userName+","+LogicClass.defaultAmount);
            bw.newLine();
            bw.close();

        } catch (IOException ie) {
            System.out.println("Failed to append");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

}
