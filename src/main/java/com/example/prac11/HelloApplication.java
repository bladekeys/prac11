package com.example.prac11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 505);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.setMinHeight(505);
        stage.setMaxHeight(505);
        stage.setMinWidth(500);
        stage.setMaxWidth(500);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}