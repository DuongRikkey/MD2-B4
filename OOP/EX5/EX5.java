package OOP.EX5;

public class EX5 {
public static void main(String[] args) {
    classJava student = new classJava();
//    student.setName("Duong");
//    student.setClasses("MS1-04");
    System.out.println("Name: "+student.getName());
    System.out.println("Classes: "+student.getClasses());
}
}
//Tóm lại
//1. Trước khi thay đổi access modifier;
//Chúng ta có thể thay đổi phương thức setName và setClass để thay đôổi giá trị của name
//2. Sau khi thay đổi access modifier;
//Chúng ta ko thể thay đổi pt SN Và SC