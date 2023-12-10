package com.example.pong.model;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import static com.example.pong.utill.Draw.draw;
import static com.example.pong.utill.Draw.drawOver;

public class Paddle {

    private int with;
    private int hight;
    private int xPos;
    private int yPos;
    private Color color = Color.BLUE;
    private int velocity = 4;

    public Paddle(int with, int hight, int xPos, int yPos) {
        setWith(with);
        setHight(hight);
        setxPos(xPos);
        setyPos(yPos);
    }

    public void moveRight(Canvas canvas){
        // checks if player is on screen.
        if (this.getxPos() < 400) {

            drawOver(this, canvas);
            setxPos(this.getxPos() + velocity);
            draw(this, canvas);


        }

    }
    public void moveLeft(Canvas canvas){
        // checks if player is on screen.
        if (this.getxPos() >= 0) {

            drawOver(this, canvas);
            setxPos(this.getxPos() - velocity);
            draw(this, canvas);


        }

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

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
