/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Vish
 */
public class Project extends Application {
    
    static Stage startGame=new Stage();
    static Stage gameWindow=new Stage();
    static Stage jackpotCombinations=new Stage();
    static Stage highScores=new Stage();
    static Stage winner=new Stage();
    
    static StartGameController s1; 
    static GameWindowController s2; 
    static JackpotCombinationsController s3;
    static HighScoresController s4;
    static WinnerController s5;
    
    @Override
    public void start(Stage stage) throws Exception {
       
        FXMLLoader r1 = new FXMLLoader(getClass().getResource("StartGame.fxml"));
        FXMLLoader r2 = new FXMLLoader(getClass().getResource("GameWindow.fxml"));
        FXMLLoader r3 = new FXMLLoader(getClass().getResource("JackpotCombinations.fxml"));
        FXMLLoader r4 = new FXMLLoader(getClass().getResource("HighScores.fxml"));
        FXMLLoader r5 = new FXMLLoader(getClass().getResource("Winner.fxml"));
       
        Parent root1 = r1.load();
        Parent root2 = r2.load();
        Parent root3 = r3.load();
        Parent root4 = r4.load();
        Parent root5 = r5.load();
        
        s1 = r1.getController();
        s2 = r2.getController();
        s3 = r3.getController();
        s4 = r4.getController();
        s5 = r5.getController();
        
        
        Scene scene1 = new Scene(root1);
        Scene scene2 = new Scene(root2);
        Scene scene3 = new Scene(root3);
        Scene scene4 = new Scene(root4);
        Scene scene5 = new Scene(root5);
        
        startGame.setScene(scene1);
        gameWindow.setScene(scene2);
        jackpotCombinations.setScene(scene3);
        highScores.setScene(scene4);
        winner.setScene(scene5);
        
        startGame.setTitle("Bingo");
        gameWindow.setTitle("Bingo");
        jackpotCombinations.setTitle("Bingo");
        highScores.setTitle("Bingo");
        winner.setTitle("Bingo");
      
        showStartWindow();
    }

    public static void showStartWindow(){
        startGame.show();
        gameWindow.hide();
        jackpotCombinations.hide();
        highScores.hide();
        winner.hide();
        s1.onLoad();
    }
    
    public static void showGameWindow(){
        startGame.hide();
        gameWindow.show();
        jackpotCombinations.hide();
        highScores.hide();
        winner.hide();
        s2.onLoad();
    }
    
    public static void showJackpotCombinationsWindow(){
        startGame.hide();
        gameWindow.hide();
        jackpotCombinations.show();
        highScores.hide();
        winner.hide();
    }
    
    public static void showHighScoresWindow(){
        startGame.hide();
        gameWindow.hide();
        jackpotCombinations.hide();
        highScores.show();
        winner.hide();
    }
    
    public static void winnerWindow(){
        startGame.hide();
        gameWindow.hide();
        jackpotCombinations.hide();
        highScores.hide();
        winner.show();
        s5.onLoad();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }    
}
