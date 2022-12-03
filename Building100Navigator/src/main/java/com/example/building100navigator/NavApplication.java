package com.example.building100navigator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NavApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NavApplication.class.getResource("NavFX.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 644);
        stage.setTitle("Building 100 Navigator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}