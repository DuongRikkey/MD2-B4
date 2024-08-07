package OOP.EX8;

import java.util.Scanner;

public class employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private double salary;
    private double rate;


    public employee() {
        this.employeeId =0;
        this.employeeName = "";
        this.age = 0;
        this.gen = "";
        this.rate=0;
        this.salary = 0;

    }
    public void calSalary(){
        this.salary = rate * 1300000;
    }
    public employee(String employeeId, String employeeName, int age, String gen, double salary,double rate) {
        this.employeeId = Integer.parseInt(employeeId);
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate= rate;
        calSalary();


    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        this.employeeId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter employee name: ");
        this.employeeName = sc.nextLine();
        System.out.println("Enter employee age: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter employee gen: ");
        this.gen = sc.nextLine();

        System.out.print("Enter employee rate: ");
        this.rate = sc.nextDouble();
        calSalary();
    }
    public void displayData(){
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Gen: " + gen);
        System.out.println("Rate: " + rate);
        System.out.println("Salary: " + salary);
    }


}
