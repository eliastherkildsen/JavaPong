package com.example.pong;

import com.example.pong.model.Ball;
import com.example.pong.model.Paddle;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import static com.example.pong.utill.Draw.draw;

public class Controller {

    private Ball ball;
    private Paddle paddle;
    @FXML
    private Canvas canvas;
    @FXML
    protected void handleButton() {
        // setup
        setup();
    }

    public void setup() {

        // creating ball obj.
        ball = new Ball(0, 0, 15, 15);

        // creating paddle obj.
        paddle = new Paddle(200, 150, 30, 400);

        // drawing ball.
        draw(ball, canvas);

        // drawing paddle.
        draw(paddle, canvas);

        Application.running = true;
    }

    public void moveLeft() {
        paddle.moveLeft(canvas);
    }

    public void moveRight() {
        paddle.moveRight(canvas);
    }

    public void moveBall(){

        ball.updatePos(canvas);
    }

}
