package OOP.EX7;

public class EX7 {
    public static void main(String[] args) {
        Cricle cricle1 = new Cricle(1.2,"white");
        System.out.println(cricle1.getArea());
        System.out.println(cricle1.getRadius());

        Cricle cricle2 = new Cricle();
        System.out.println(cricle2.getRadius());
        System.out.println(cricle2.getArea());
    }
}
//Chú thích khi thay doi Thay đổi access modifier cho các phương thức getRadius() và getArea() thành private, sau đó test lại và quan sát kết quả.
//thì ko chú thể truy cập getR và get Area