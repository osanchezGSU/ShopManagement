package com.example.shopmanagement;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MyApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            FXMLLoader splashLoader = new FXMLLoader(getClass().getResource("splash-screen.fxml"));
            Parent splashRoot = splashLoader.load();
            Scene splashScene = new Scene(splashRoot);




            PauseTransition pause = new PauseTransition(Duration.seconds(2));
            pause.setOnFinished(actionEvent -> {
                FadeTransition fadeOut = new FadeTransition(Duration.seconds(2));
                fadeOut.setFromValue(1);
                fadeOut.setToValue(0);
                fadeOut.setOnFinished(fadeEvent -> {
                    try{
                        FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("my-application.fxml"));
                        Parent mainRoot = mainLoader.load();
                        Scene mainScene = new Scene(mainRoot);
                        primaryStage.setScene(mainScene);
                        primaryStage.setTitle("Shop Management");
                        primaryStage.setFullScreen(true);

                        FadeTransition fadeIn = new FadeTransition(Duration.seconds(2));
                        fadeIn.setFromValue(0);
                        fadeIn.setToValue(1);
                        fadeIn.play();
                    }catch (Exception e){
                    }
                });

                fadeOut.play();
            });

            primaryStage.setScene(splashScene);
            primaryStage.show();
            pause.play();
        } catch (Exception e){}
    }

    public static void main(String[] args) {
        launch(args);
    }
}

