package OOP.EX2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //Get set


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        } else {
            return (-b + Math.pow(delta,0.5) / (2 * a));
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        } else {
            return (-b - Math.pow(delta,0.5)) / (2 * a);
        }
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        this.a = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập b: ");
        this.b = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập c: ");
        this.c = scanner.nextDouble();
    }

    public void displayData() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("Discriminant: " + getDiscriminant());
    }




    public void checkHopLeDelta () {
        double delta = getDiscriminant();
        if (delta > 0) {
     ;     System.out.println("Phương trình có hai nghiệm: ");
            System.out.println("Nghiệm thứ nhất: " + getRoot1());
            System.out.println("Nghiệm thứ hai: " + getRoot2());
        } else if (delta == 0) {
            System.out.println("Delta bằng 0, phương trình có một nghiệm kép."+getRoot1());
        } else {
            System.out.println("Delta nhỏ hơn 0, phương trình không có nghiệm thực.");
        }
    }
}
