package com.example.pong.model;

import javafx.scene.paint.Color;

public class Ball {

    private int xPos;
    private int yPos;
    private int hight;
    private int with;
    private Color color = Color.RED;
    private int velocity = 0;


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


    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getVelocity(){
        return this.velocity;
    }

}
