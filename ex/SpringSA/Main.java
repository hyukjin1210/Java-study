package ex.SpringSA;

public class Main {
    public static void main(String[] args) {
        Bus b1 = new Bus(300, 1000);
        Bus b2 = new Bus(50, 1000);

        b1.Info();
        b2.Info();
        b1.statusMode();

        b1.useTransPort(3);



        b1.gasolineChk(-50);

        b1.power();
        b1.statusMode();

        b1.gasolineChk(10);

        b1.power();
        b1.statusMode();

        b1.useTransPort(45);
        b1.useTransPort(5);

//        b1.gasolineChk(-55);

        b1.speedUp(30);
        b1.speedUp(100);

        b1.speedDown(40);
        b1.speedDown(90);

    }
}
