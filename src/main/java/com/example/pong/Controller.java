package com.example.pong;

import com.example.pong.model.Ball;
import com.example.pong.model.Paddle;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import static com.example.pong.utill.Draw.*;


public class Controller {

    Paddle paddle = new Paddle(50,50,2,2);
    Ball ball = new Ball(300,400,10,10);

    @FXML
    Canvas canvas;

    @FXML
    protected void handleButton(){
        // setup

        // draw ball
        drawOver(ball, canvas);
        ball.setVelocity(20);

        ball.setxPos(ball.getxPos() + ball.getVelocity());
        ball.setyPos(ball.getyPos() + ball.getVelocity());

        draw(ball, canvas);


    }

    public static void key(){
        System.out.println("Key Pressed: " + Application.keyText);
    }


}
