package OOP.EX9;

import java.util.Scanner;

public class EX9 {

    public static void main(String[] args) {
        Student[] student = new Student[4];
        int countStudent = 0;

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("Menu:");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    displayAllStudent(student, countStudent);
                    break;
                case 2:
                    countStudent = addStudent(student, countStudent, sc);
                    break;
                case 3:
                    updateStudent(student, countStudent, sc);
                    break;
//              case 4:
//                  deleteStudent(student,countStudent,sc);
//                  break;
                case 5:
                    System.out.println("Thoát khỏi chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn ko tồn tại nhập lại");
                    ;


            }
        }
    }

    public static void updateStudent(Student[] student, int countStudent, Scanner sc) {
        System.out.println("Enter your id want to update: ");
        int updateId = Integer.parseInt(sc.nextLine());
        int indexUpdate = findIndexStudent(student,countStudent,updateId);
        if(indexUpdate != -1) {
            System.out.println("Nhập thông tin mới cho học sinh với mã ID: " + updateId);
            Student updatedStudent = new Student();
            updatedStudent.inputData();

            // Cập nhật thông tin học sinh trong mảng
            student[indexUpdate] = updatedStudent;

            System.out.println("Cập nhật thông tin thành công!");


        }
        else {
            System.out.println("Học sinh với mã ID " + updateId + " không tồn tại.");
        }


    }

    private static void displayAllStudent(Student[] student, int countStudent) {
        for (int i = 0; i < countStudent; i++) {
            student[i].displayData();
        }
    }


    private static int addStudent(Student[] student, int countStudent, Scanner sc) {
        System.out.println("Mời bạn nhập số lượng ");
        int addNumStudent = sc.nextInt();

        for (int i = 0; i < addNumStudent; i++) {
            if (countStudent > student.length) {
                System.out.println("Full");
                break;
            }
            System.out.println("Nhập thông tin của số học" + (i + 1) + ":");
            Student student1 = new Student();
            student1.inputData();
            student[countStudent] = student1;
            countStudent++;
        }
        return countStudent;
    }


    public static int findIndexStudent(Student[] student, int countStudent, int idFind) {
        for (int i = 0; i < countStudent; i++) {
            if (student[i].getStudent() == idFind) {
                return i;
            }
        }
        return -1;
    }


    public static void deleteStudent(Student[] student, int countStudent, Scanner sc) {
        // Nhập mã học sinh cần xóa
        System.out.print("Nhập mã học sinh cần xóa: ");
        int deleteId = Integer.parseInt(sc.nextLine());

        // Tìm chỉ số của học sinh cần xóa
        int indexDelete = findIndexStudent(student, countStudent, deleteId);

        if (indexDelete != -1) {
            // Học sinh được tìm thấy, xóa học sinh bằng cách di chuyển các phần tử còn lại
            for (int i = indexDelete; i < countStudent - 1; i++) {
                student[i] = student[i + 1];
            }
            student[countStudent - 1] = null; // Đặt giá trị null vào vị trí cuối cùng
            countStudent--; // Giảm số lượng học sinh

            System.out.println("Xóa học sinh thành công!");
        } else {
            // Học sinh không tìm thấy
            System.out.println("Học sinh với mã ID " + deleteId + " không tồn tại.");
        }
    }

}

