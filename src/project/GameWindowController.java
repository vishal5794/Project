/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Vish
 */
public class GameWindowController implements Initializable {

    @FXML
    private Button winnigPrizes;

    @FXML
    private Button highScores;

    @FXML
    private Button bet;

    @FXML
    private Button quit;

    @FXML
    private RadioButton betOfOne;

    @FXML
    private RadioButton betOfTwo;

    @FXML
    private RadioButton betOfFive;

    @FXML
    private Label name;

    @FXML
    private Label displayPlayername;

    @FXML
    private Label coinsEarned;

    @FXML
    private Label displayAmount;

    @FXML
    private ImageView ivOne;

    @FXML
    private ImageView ivTwo;

    @FXML
    private ImageView ivThree;

    @FXML
    private ImageView ivFour;

    @FXML
    private ImageView ivFive;

    @FXML
    private ImageView ivSix;

    @FXML
    private ImageView ivSeven;

    @FXML
    private ImageView ivEight;

    @FXML
    private ImageView ivNine;

    

    @FXML
    public void jackPotCombinationsWindow() {
        Project.showJackpotCombinationsWindow();
    }

    @FXML
    public void HighScoreWindow() {
        Project.showHighScoresWindow();
        HighScoresController h = new HighScoresController();
        h.readFromFile();
    }

    @FXML
    public void onLoad() {
        name.setText(LogicClass.userName);
        displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
    }

    @FXML
    public void showWinningPrize() {
        Project.winnerWindow();
        WinnerController w = new WinnerController();
        w.showPrize();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup betButtons = new ToggleGroup();
        betOfOne.setToggleGroup(betButtons);
        betOfTwo.setToggleGroup(betButtons);
        betOfFive.setToggleGroup(betButtons);

        bet.setOnAction(e -> rImage());

    }

    WinnerController w=new WinnerController();
    
    public int getRandomIndex() {
        Random r = new Random();
        int index = r.nextInt(9);
        return index;
    }

    public int getBetPrice() {
        int bet = 0;
        if (betOfOne.isSelected()) {
            bet = 1;
        } else if (betOfTwo.isSelected()) {
            bet = 2;
        } else if (betOfFive.isSelected()) {
            bet = 5;
        }
        return bet;
    }

    public void rImage() {
        int img0 = getRandomIndex();
        int img1 = getRandomIndex();
        int img2 = getRandomIndex();
        int img3 = getRandomIndex();
        int img4 = getRandomIndex();
        int img5 = getRandomIndex();
        int img6 = getRandomIndex();
        int img7 = getRandomIndex();
        int img8 = getRandomIndex();

        int iv0 = img0;
        switch (iv0) {
            case 0:
                ivOne.setImage(new Image("images/1.jpg"));
                break;
            case 1:
                ivOne.setImage(new Image("images/2.png"));
                break;
            case 2:
                ivOne.setImage(new Image("images/3.png"));
                break;
            case 3:
                ivOne.setImage(new Image("images/4.jpg"));
                break;
            case 4:
                ivOne.setImage(new Image("images/5.png"));
                break;
            case 5:
                ivOne.setImage(new Image("images/6.png"));
                break;
            case 6:
                ivOne.setImage(new Image("images/7.jpg"));
                break;
            case 7:
                ivOne.setImage(new Image("images/8.png"));
                break;
            case 8:
                ivOne.setImage(new Image("images/9.png"));
                break;
            default:
                break;
        }

        int iv1 = img1;
        switch (iv1) {
            case 0:
                ivTwo.setImage(new Image("images/1.jpg"));
                break;
            case 1:
                ivTwo.setImage(new Image("images/2.png"));
                break;
            case 2:
                ivTwo.setImage(new Image("images/3.png"));
                break;
            case 3:
                ivTwo.setImage(new Image("images/4.jpg"));
                break;
            case 4:
                ivTwo.setImage(new Image("images/5.png"));
                break;
            case 5:
                ivTwo.setImage(new Image("images/6.png"));
                break;
            case 6:
                ivTwo.setImage(new Image("images/7.jpg"));
                break;
            case 7:
                ivTwo.setImage(new Image("images/8.png"));
                break;
            case 8:
                ivTwo.setImage(new Image("images/9.png"));
                break;
            default:
                break;
        }

        int iv2 = img2;
        switch (iv2) {
            case 0:
                ivThree.setImage(new Image("images/1.jpg"));
                break;
            case 1:
                ivThree.setImage(new Image("images/2.png"));
                break;
            case 2:
                ivThree.setImage(new Image("images/3.png"));
                break;
            case 3:
                ivThree.setImage(new Image("images/4.jpg"));
                break;
            case 4:
                ivThree.setImage(new Image("images/5.png"));
                break;
            case 5:
                ivThree.setImage(new Image("images/6.png"));
                break;
            case 6:
                ivThree.setImage(new Image("images/7.jpg"));
                break;
            case 7:
                ivThree.setImage(new Image("images/8.png"));
                break;
            case 8:
                ivThree.setImage(new Image("images/9.png"));
                break;
            default:
                break;
        }

        int iv3 = img3;
        switch (iv3) {
            case 0:
                ivFour.setImage(new Image("images/1.jpg"));
                break;
            case 1:
                ivFour.setImage(new Image("images/2.png"));
                break;
            case 2:
                ivFour.setImage(new Image("images/3.png"));
                break;
            case 3:
                ivFour.setImage(new Image("images/4.jpg"));
                break;
            case 4:
                ivFour.setImage(new Image("images/5.png"));
                break;
            case 5:
                ivFour.setImage(new Image("images/6.png"));
                break;
            case 6:
                ivFour.setImage(new Image("images/7.jpg"));
                break;
            case 7:
                ivFour.setImage(new Image("images/8.png"));
                break;
            case 8:
                ivFour.setImage(new Image("images/9.png"));
                break;
            default:
                break;
        }

        int iv4 = img4;
        switch (iv4) {
            case 0:
                ivFive.setImage(new Image("images/1.jpg"));
                break;
            case 1:
                ivFive.setImage(new Image("images/2.png"));
                break;
            case 2:
                ivFive.setImage(new Image("images/3.png"));
                break;
            case 3:
                ivFive.setImage(new Image("images/4.jpg"));
                break;
            case 4:
                ivFive.setImage(new Image("images/5.png"));
                break;
            case 5:
                ivFive.setImage(new Image("images/6.png"));
                break;
            case 6:
                ivFive.setImage(new Image("images/7.jpg"));
                break;
            case 7:
                ivFive.setImage(new Image("images/8.png"));
                break;
            case 8:
                ivFive.setImage(new Image("images/9.png"));
                break;
            default:
                break;
        }

        int iv5 = img5;
        switch (iv5) {
            case 0:
                ivSix.setImage(new Image("images/1.jpg"));
                break;
            case 1:
                ivSix.setImage(new Image("images/2.png"));
                break;
            case 2:
                ivSix.setImage(new Image("images/3.png"));
                break;
            case 3:
                ivSix.setImage(new Image("images/4.jpg"));
                break;
            case 4:
                ivSix.setImage(new Image("images/5.png"));
                break;
            case 5:
                ivSix.setImage(new Image("images/6.png"));
                break;
            case 6:
                ivSix.setImage(new Image("images/7.jpg"));
                break;
            case 7:
                ivSix.setImage(new Image("images/8.png"));
                break;
            case 8:
                ivSix.setImage(new Image("images/9.png"));
                break;
            default:
                break;
        }

        int iv6 = img6;
        switch (iv6) {
            case 0:
                ivSeven.setImage(new Image("images/1.jpg"));
                break;
            case 1:
                ivSeven.setImage(new Image("images/2.png"));
                break;
            case 2:
                ivSeven.setImage(new Image("images/3.png"));
                break;
            case 3:
                ivSeven.setImage(new Image("images/4.jpg"));
                break;
            case 4:
                ivSeven.setImage(new Image("images/5.png"));
                break;
            case 5:
                ivSeven.setImage(new Image("images/6.png"));
                break;
            case 6:
                ivSeven.setImage(new Image("images/7.jpg"));
                break;
            case 7:
                ivSeven.setImage(new Image("images/8.png"));
                break;
            case 8:
                ivSeven.setImage(new Image("images/9.png"));
                break;
            default:
                break;
        }

        int iv7 = img7;
        switch (iv7) {
            case 0:
                ivEight.setImage(new Image("images/1.jpg"));
                break;
            case 1:
                ivEight.setImage(new Image("images/2.png"));
                break;
            case 2:
                ivEight.setImage(new Image("images/3.png"));
                break;
            case 3:
                ivEight.setImage(new Image("images/4.jpg"));
                break;
            case 4:
                ivEight.setImage(new Image("images/5.png"));
                break;
            case 5:
                ivEight.setImage(new Image("images/6.png"));
                break;
            case 6:
                ivEight.setImage(new Image("images/7.jpg"));
                break;
            case 7:
                ivEight.setImage(new Image("images/8.png"));
                break;
            case 8:
                ivEight.setImage(new Image("images/9.png"));
                break;
            default:
                break;
        }

        int iv8 = img8;
        switch (iv8) {
            case 0:
                ivNine.setImage(new Image("images/1.jpg"));
                break;
            case 1:
                ivNine.setImage(new Image("images/2.png"));
                break;
            case 2:
                ivNine.setImage(new Image("images/3.png"));
                break;
            case 3:
                ivNine.setImage(new Image("images/4.jpg"));
                break;
            case 4:
                ivNine.setImage(new Image("images/5.png"));
                break;
            case 5:
                ivNine.setImage(new Image("images/6.png"));
                break;
            case 6:
                ivNine.setImage(new Image("images/7.jpg"));
                break;
            case 7:
                ivNine.setImage(new Image("images/8.png"));
                break;
            case 8:
                ivNine.setImage(new Image("images/9.png"));
                break;
            default:
                break;
        }

        if (img0 == img1 && img0 == img2 && img1 == img2) {
            LogicClass.pattern = 1;
            LogicClass.defaultAmount = LogicClass.defaultAmount + (20 * getBetPrice());
            displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
        } else if (img3 == img4 && img3 == img5 && img4 == img5) {
            LogicClass.pattern = 2;
            LogicClass.defaultAmount = LogicClass.defaultAmount + (1000 * getBetPrice());
            displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
        } else if (img6 == img7 && img6 == img8 && img7 == img8) {
            LogicClass.pattern = 3;
            LogicClass.defaultAmount = LogicClass.defaultAmount + (20 * getBetPrice());
            displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
        } else if (img0 == img4 && img0 == img8 && img4 == img8) {
            LogicClass.pattern = 4;
            LogicClass.defaultAmount = LogicClass.defaultAmount + (500 * getBetPrice());
            displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
        } else if (img2 == img4 && img2 == img6 && img4 == img6) {
            LogicClass.pattern = 5;
            LogicClass.defaultAmount = LogicClass.defaultAmount + (500 * getBetPrice());
            displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
        } else if (img1 == img6 && img1 == img8 && img6 == img8) {
            LogicClass.pattern = 6;
            LogicClass.defaultAmount = LogicClass.defaultAmount + (200 * getBetPrice());
            displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
        } else if (img4 == img6 && img4 == img8 && img6 == img8) {
            LogicClass.pattern = 7;
            LogicClass.defaultAmount = LogicClass.defaultAmount + (100 * getBetPrice());
            displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
        } else if (img0 == img2 && img0 == img4 && img2 == img4) {
            LogicClass.pattern = 8;
            LogicClass.defaultAmount = LogicClass.defaultAmount + (100 * getBetPrice());
            displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
        } else if (img0 == img4 && img0 == img6 && img4 == img6) {
            LogicClass.pattern = 9;
            LogicClass.defaultAmount = LogicClass.defaultAmount + (50 * getBetPrice());
            displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
        } else if (betOfOne.isSelected()) {
            if (LogicClass.defaultAmount > 0) {
                LogicClass.defaultAmount = LogicClass.defaultAmount - 1;
                displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
            }
            if (LogicClass.defaultAmount <= 0) {
                displayAmount.setText("Your Credit Over!!!");
                w.showPrize();
            }
        } else if (betOfTwo.isSelected()) {
            if (LogicClass.defaultAmount > 0) {
                LogicClass.defaultAmount = LogicClass.defaultAmount - 2;
                displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
            }
            if (LogicClass.defaultAmount <= 0) {
                displayAmount.setText("Your Credit Over!!!");
                w.showPrize();
            }
        } else if (betOfFive.isSelected()) {
            if (LogicClass.defaultAmount > 0) {
                LogicClass.defaultAmount = LogicClass.defaultAmount - 5;
                displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
                
            }
            if (LogicClass.defaultAmount <= 0) {
                displayAmount.setText("Your Credit Over!!!");
                w.showPrize();
            }
        } else {
            displayAmount.setText(String.valueOf(LogicClass.defaultAmount));
        }
    }
}

