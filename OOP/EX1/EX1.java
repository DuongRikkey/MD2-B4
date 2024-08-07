package OOP.EX1;

public class EX1 {
    public static void main(String[] args) {
        //Tạo đối tượng k có tham số
        Circle circle1 = new Circle();
        circle1.inputData();
        circle1.displayData();
        //Tạo đối tượng  có tham số
        Circle circle2 = new Circle(5, "Xanh");
        circle2.displayData();

        //Sử dụng set và get;
        Circle circle3 = new Circle();
        System.out.println(circle3.getRadius());
        circle3.setRadius(10);
        circle3.setColor("Blue");
        circle3.displayData();

//        System.out.println(circle3.Perimeter());
//        System.out.println(circle3.Area());


    }
}
