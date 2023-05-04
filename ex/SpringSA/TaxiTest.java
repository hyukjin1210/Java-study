package ex.SpringSA;

public class TaxiTest {
    public static void main(String[] args) {
        Taxi ta = new Taxi(3321,4000);
        ta.gasolineMessage();
        ta.statusMode(1);
        ta.useTransPort(2);
        ta.priceChk();
        ta.calculate("서울역",2);
        ta.gasolineMessage();
        ta.total();

        ta.useTransPort(5);

        ta.statusMode(1);
        ta.useTransPort(3);
        ta.priceChk();
        ta.calculate("야탑역",2);
        ta.gasolineMessage();
        ta.total();
    }
}
