package com.example.pong.model;

import javafx.scene.paint.Color;

public class Paddle {

    private int with;
    private int hight;
    private int xPos;
    private int yPos;
    private Color color = Color.BLUE;
    private double velocity;

    public Paddle(int with, int hight, int xPos, int yPos) {
        setWith(with);
        setHight(hight);
        setxPos(xPos);
        setyPos(yPos);
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
}
