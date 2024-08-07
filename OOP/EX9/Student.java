package OOP.EX9;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String name;
    private int age;
    private String gender;
    public String address;
    public String phoneNumber;

    public Student() {
        this.studentId = 0;
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.address = "";
        this.phoneNumber = "";
    }

    public Student(int student, String name, int age, String gender, String address, String phoneNumber) {
        this.studentId = student;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;


    }
//    Getter and Setter


    public int getStudent() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setStudent(int student) {
        this.studentId = student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Id: ");
        this.studentId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter student name: ");
        this.name = sc.nextLine();
        System.out.println("Enter student age: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter student gender: ");
        this.gender = sc.nextLine();
        System.out.println("Enter student address: ");
        this.address = sc.nextLine();
        System.out.println("Enter student phone number: ");
        this.phoneNumber = sc.nextLine();


    }

    public void displayData() {
        System.out.println("Student Id: " + this.studentId);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
        System.out.println("Student Gender: " + this.gender);
        System.out.println("Student Address: " + this.address);
        System.out.println("Student Phone Number: " + this.phoneNumber);
    }


}

