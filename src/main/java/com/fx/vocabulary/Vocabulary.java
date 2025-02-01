package com.fx.vocabulary;

import com.fx.vocabulary.util.VocabularyUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Vocabulary extends Application {

    private static Stage stageParam;

    @Override
    public void start(Stage stage) throws IOException {
        stageParam = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Vocabulary.class.getResource("primary-stage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Vocabulary");
        stage.setScene(scene);
        stage.setAlwaysOnTop(true);
        stage.show();
    }

    public static void main(String[] args) throws IOException {
        VocabularyUtil.initVoc(args);
        launch();
    }

    public static Stage getStage(){
        return stageParam;
    }
}