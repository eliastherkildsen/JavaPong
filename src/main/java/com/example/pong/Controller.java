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

    public static int scorre = 0;

    public void setup() {

        // creating ball obj.
        ball = new Ball(0, 0, 15, 15);

        // creating paddle obj.
        paddle = new Paddle(100, 15, 0, 400);

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

    public void moveBall(boolean collison){
        ball.updatePos(canvas, collison);
        if (collison){
            scorre++;
        }
    }

    public boolean collison(){
        return ball.checkCollison(paddle);
    }

    public void debug(){

        System.out.printf("[BALL]   X %d - Y %d - V(x) %d - V(y) %d  [PADDLE]   X %d - Y %d [GAMEFRAME] %d [SCORE] %d\r", ball.getxPos(), ball.getyPos(),
                ball.getVelocityX(), ball.getVelocityY(), paddle.getxPos(), paddle.getyPos(), Application.gameFrame, scorre);


    }

}
