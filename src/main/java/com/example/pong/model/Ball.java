package com.example.pong.model;

import com.example.pong.Controller;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

import java.util.Random;

import static com.example.pong.utill.Draw.draw;
import static com.example.pong.utill.Draw.drawOver;

public class Ball {

    private int xPos;
    private int yPos;
    private int hight;
    private int with;
    private Color color = Color.RED;
    private int velocityX = 4;
    private int velocityY = 4;

    private int modifier = 0;


    public Ball(int yPos, int xPos, int with, int hight) {
        setyPos(yPos);
        setxPos(xPos);
        setWith(with);
        setHight(hight);

    }
    public Ball(int yPos, int xPos, int with, int hight, Color color) {
        this(yPos, xPos, with, hight);
        setColor(color);

    }

    public boolean checkCollison(Paddle paddle){
        // checks if the ball is in range of the paddle
        return this.getyPos() >= 378 && this.getxPos() >= paddle.getxPos() && this.getxPos() < paddle.getxPos() + paddle.getWith();

    }
    public void updatePos(Canvas canvas, boolean collided){

        drawOver(this, canvas);
        Random random = new Random();

        int min = -8;
        int max = 8;

        if (collided){
            velocityX = random.nextInt((max - min) + 1) + min;
        }

        if (this.getxPos() <= 0){
            velocityX = 2;
        }

        if (this.getxPos() >= 400){
            velocityX = -2;
        }



        if (collided){
            velocityY = -8 - modifier;
        }
        if (this.getyPos() < - 400 || this.getyPos() <= 0){
            velocityY = 8 + modifier;
        }

        if (this.getyPos() >= 400){
            System.out.println("GAME OVER!");
            this.setxPos(0);
            this.setyPos(0);
            this.velocityY = 4;
            this.velocityX = 4;

            Controller.scorre = 0;

        }

        modifier = Controller.scorre;


        this.setxPos((this.getxPos() + velocityX));
        this.setyPos((this.getyPos() + velocityY));

        draw(this, canvas);

    }

    private void setColor(Color color) {
        this.color = color;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setHight(int hight){
        this.hight = hight;
    }

    public int getHight() {
        return this.hight;
    }

    public void setWith(int with){
        this.with = with;
    }

    public int getWith() {
        return this.with;
    }

    public int getVelocityX(){return this.velocityX;}
    public int getVelocityY(){return this.velocityY;}

    public Color getColor() {
        return this.color;
    }



}
