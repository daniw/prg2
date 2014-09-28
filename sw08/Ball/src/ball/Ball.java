/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ball;

import java.awt.Color;


/**
 *
 * @author daniw
 */
public class Ball {
    
    private int radius;
    private int x;
    private int y;
    private Color color;
    private int speed;

    public Ball(int x, int y) {
        this.radius = 10;
        this.x = x;
        this.y = y;
        this.color = new Color(127, 127, 127);
        this.speed = 15;
    }

    public Color getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
