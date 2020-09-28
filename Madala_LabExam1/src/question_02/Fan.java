/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_02;

/**
 *
 * @author Sreenidhi Madala
 */
public class Fan {

    static final int slow = 1;
    static final int Medium = 2;
    static final int fast = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * Gets the fan speed.
     *
     * @return this speed
     */
    public int getspeed() {
        return speed;
    }

    /**
     * checks whether the fan is on or not.
     *
     * @return this on
     */
    public boolean ison() {
        return on;
    }

    /**
     * Gets the radius of the fan.
     *
     * @return this radius
     */
    public double getradius() {
        return radius;
    }

    /**
     * Gets the color of the fan.
     *
     * @return this color
     */
    public String getcolor() {
        return color;
    }

    /**
     * changes the speed of a fan
     *
     * @param speedNew
     */
    public void setspeed(int speedNew) {
        this.speed = speedNew;
    }

    /**
     * changes the on or off for a fan
     *
     * @param onNew
     */
    public void seton(boolean onNew) {
        this.on = onNew;
    }

    /**
     * changes the radius of a fan
     *
     * @param radiusNew
     */
    public void setradius(double radiusNew) {
        this.radius = radiusNew;
    }

    /**
     * changes the color of a fan
     *
     * @param colorNew
     */
    public void setcolor(String colorNew) {
        this.color = colorNew;
    }

    /**
     * This is no-argument constructor constructor with an empty body return
     * null
     */
    public Fan() {

    }

    /**
     * Gets the information of the fan.
     *
     * @return this as string
     */
    public String toString() {
        if (on == true) {
            return "Fan's details" + ", Speed: " + speed + ", color: " + color + ", "
                    + "radius: " + radius;
        } else {
            return "fan is off" + " color: " + color + ", radius: " + radius;
        }
    }
}
