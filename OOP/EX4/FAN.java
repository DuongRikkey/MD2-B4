package OOP.EX4;

public class FAN {
    public static final int SLOW=1;
    public static final int MEDIUM=2;
    public static final int FAST=3;
    //dùng static mới chấm vào được

    private int speed;
    private boolean on;
    private double radius;
    private  String color;

    public FAN() {
        this.speed=SLOW;
        this.on=false;
        this.radius=5;
        this.color="Blue";

    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Phương thức

    public FAN(int speed) {
        this.speed = speed;
    }

    public FAN(boolean on) {
        this.on = on;
    }

    public FAN(double radius) {
        this.radius = radius;
    }

    public FAN(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan is on [speed=" + speed + ", color=" + color + ", radius=" + radius + "]";
        } else {
            return "Fan is off [color=" + color + ", radius=" + radius + "]";
        }
    }
}
