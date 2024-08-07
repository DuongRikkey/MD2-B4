package OOP.EX1;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 0;
        this.color = "đỏ";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double Perimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double Area() {
        return Math.PI * this.radius * this.radius;
    }
    //Get and set


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập bán kính");
        this.radius = sc.nextDouble();
        sc.nextLine();
        System.out.println("Mời bạn nhập màu sắc");
        this.color = sc.nextLine();

    }

    public void displayData() {
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }

}
