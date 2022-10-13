package edu.bsu.cs222.theperfectbet;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class HelloController {
    @FXML
    private Label Choose_lb;
    @FXML
    private Label Team1_lb;
    @FXML
    private Label Team2_lb;
    @FXML
    private Label Statistics_lb;
    @FXML
    private Label Odds_lb;

    @FXML
    private ChoiceBox Sport_cb;

    @FXML
    private ImageView refresh_img;

    @FXML
    protected void refreshClick() throws IOException {
        SportsParser sportsParser = new SportsParser();
        InputStream inputStream0 = sportsParser.apiParser();
        ArrayList<String> sportsList =  sportsParser.parseSports(inputStream0);
        for(int i=0; i < sportsList.size(); i++){
            Sport_cb.getItems().add(sportsList.get(i));
        }
    }

    @FXML
    protected void onButtonClick() throws IOException {
        System.out.println("hi");
    }
}