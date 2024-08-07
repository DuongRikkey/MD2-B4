package OOP.EX7;

public class Cricle {
    private double radius;
    private String color;

    public Cricle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
       return Math.PI*radius * radius;
    }
}
