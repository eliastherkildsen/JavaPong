package com.example.pong.utill;

import com.example.pong.model.Ball;
import com.example.pong.model.Paddle;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;



public class Draw {

    public static void draw(Paddle paddle, Canvas canvas){

        int x = paddle.getxPos();
        int y = paddle.getyPos();
        int w = paddle.getWith();
        int h = paddle.getHight();

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLUEVIOLET);
        gc.fillRect(x,y,h,w);


    }
    public static void draw(Ball ball, Canvas canvas){

        int x = ball.getxPos();
        int y = ball.getyPos();
        int w = ball.getWith();
        int h = ball.getHight();

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLUEVIOLET);
        gc.fillOval(x,y,h,w);

    }

    public static void drawOver(Ball ball, Canvas canvas){

        int x = ball.getxPos();
        int y = ball.getyPos();
        int w = ball.getWith();
        int h = ball.getHight();

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.clearRect(x,y,h,w);

    }

    public static void drawOver(Paddle paddle, Canvas canvas){

        int x = paddle.getxPos();
        int y = paddle.getyPos();
        int w = paddle.getWith();
        int h = paddle.getHight();

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLUEVIOLET);
        gc.clearRect(x,y,h,w);

    }


}
