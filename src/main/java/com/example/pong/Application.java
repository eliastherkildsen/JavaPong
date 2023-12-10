package com.example.pong;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import java.io.IOException;

public class Application extends javafx.application.Application {

    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 800;
    public static int gameFrame = 0;
    private final long TARGET_NANOSECONDS_PER_FRAME = 1000000000 / 20; // 10 frames per second
    private long lastUpdateTime = 0;
    public static boolean running = false;

    private Controller controller;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), SCREEN_WIDTH, SCREEN_HEIGHT);

        // setting up stage.
        stage.setTitle("PongFX");
        stage.setScene(scene);
        stage.show();

        // Create an instance of the Controller
        controller = fxmlLoader.getController();

        scene.setOnKeyPressed(event -> handleKeyPress(event.getCode()));

        // Start the game loop
        startGameLoop();
    }

    private void startGameLoop() {
        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                // Calculate the time since the last update
                long elapsedNanos = now - lastUpdateTime;

                // Check if it's time to update (10 times per second)
                if (elapsedNanos >= TARGET_NANOSECONDS_PER_FRAME) {
                    update(); // Call your update method here
                    lastUpdateTime = now;
                }
            }
        };

        // Start the game loop
        gameLoop.start();
    }

    // Your update method where you can perform actions in each frame
    private void update() {
        // frame counter
        gameFrame++;



        if (running) {
            controller.moveBall(controller.collison());
            controller.debug();



        } else if (!running) {
            controller.setup();
        }


    }


    // Handle key press events
    private void handleKeyPress(KeyCode code) {

        if (code == KeyCode.A) {
            // Call the moveLeft method on the Controller instance
            controller.moveLeft();
        }

        if (code == KeyCode.D) {
            // Call the moveLeft method on the Controller instance
            controller.moveRight();

        }
    }

    public static void main(String[] args) {
        launch();
    }



}

