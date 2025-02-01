package com.fx.vocabulary;

import com.fx.vocabulary.util.VocabularyUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static com.fx.vocabulary.Vocabulary.getStage;

public class VocabularyController implements Initializable {

    private Stage stage;

    @FXML
    private Label translatedText;

    @FXML
    private TextField userText;

    @FXML
    private Button translateButton;

    @FXML
    private void translateButtonClick(ActionEvent event){
        String trans = VocabularyUtil.translate(userText.getText().toLowerCase());
        translatedText.setText(trans);
        userText.setText("");
    }

    @FXML
    private void opacityLow(){
        stage.setOpacity(0.5);
    }

    @FXML
    private void opacityHigh(){
        stage.setOpacity(1);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.stage = getStage();
    }
}