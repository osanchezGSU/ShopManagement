package com.example.shopmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SwitchScenes {
    private Stage stage;
    private Scene scene;
    public void switchToScene(ActionEvent event, String fxmlName, BorderPane borderPane) throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource (fxmlName)) ;
        borderPane.setCenter(view);
    }

}
