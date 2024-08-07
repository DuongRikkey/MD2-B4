package OOP.EX2;

public class EX2QE {
    public static void main(String[] args) {
        QuadraticEquation QE = new QuadraticEquation(1,2,3);
        QE.inputData();
        QE.displayData();
        QE.checkHopLeDelta();

        System.out.println(QE.getA());
        System.out.println(QE.getB());
        System.out.println(QE.getC());
        QE.setA(2);
        QE.setB(100);
        QE.setC(100);
        QE.displayData();




    }
}
