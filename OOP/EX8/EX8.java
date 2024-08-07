package OOP.EX8;

import java.util.Arrays;
import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee[] emp = new employee[1];
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new employee();
            emp[i].inputData();
        }
        System.out.println("Thông tin tất cả nhân viên nhé");
        for (int i = 0; i < emp.length; i++) {
            emp[i].displayData();
            System.out.println();
        }





    }
}
