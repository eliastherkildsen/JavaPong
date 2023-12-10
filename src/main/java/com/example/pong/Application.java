package com.example.pong;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import java.io.IOException;

public class Application extends javafx.application.Application {

    public static String keyText;

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 800);
        scene.setOnKeyPressed(this::handleKeyPressed);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        System.out.println("hgg");

    }


    // Event handler for key pressed
    private void handleKeyPressed(KeyEvent event) {
        keyText = event.getText();

    }

    public static void main(String[] args) {
        launch();

    }


}