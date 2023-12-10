package com.example.pong.model;

import com.example.pong.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

import static com.example.pong.utill.Draw.draw;
import static com.example.pong.utill.Draw.drawOver;

public class Ball {

    private int xPos;
    private int yPos;
    private int hight;
    private int with;
    private Color color = Color.RED;
    private int velocityX = 2;
    private int velocityY = 2;


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

    public void updatePos(Canvas canvas){

        drawOver(this, canvas);

        if (this.getxPos() == 0){
            velocityX = 2;
        }
        if (this.getxPos() == Application.SCREEN_WIDTH / 2){
            velocityX =- 2;
        }


        if (this.getyPos() == 0){
            velocityY = 8;
        }
        if (this.getyPos() == Application.SCREEN_HEIGHT / 2){
            velocityY =- 8;
        }


        this.setxPos((this.getxPos() + velocityX));
        this.setyPos((this.getyPos() + velocityY));

        draw(this, canvas);
        System.out.printf("X %d - Y %d - V(x) %d - V(y) %d \r", getxPos(), getyPos(), velocityX, velocityY);



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



    public Color getColor() {
        return this.color;
    }



}
