package OOP.EX4;

public class EX4FAN {
    public static void main(String[] args) {
        FAN FAN1 = new FAN();
        FAN1.setSpeed(FAN.FAST);
        //Muon FAN1 CHAM DUOC THI FAN1 PHAI CO HAM GET
        FAN1.setRadius(10);
        FAN1.setOn(true);
        FAN1.setColor("yellow");

        FAN FAN2 = new FAN();
        FAN2.setSpeed(FAN.MEDIUM);
        FAN2.setRadius(5);
        FAN2.setOn(false);
        FAN2.setColor("blue");


        //Test phương thức toString
        System.out.println(FAN1);
        System.out.println(FAN2);

    }
}
