package day05;

public class PolyCar {
    public static void main(String[] args) {
//        자동차 생산
        System.out.println("자동차 생산 시작");
        Car1 car = PolyCar.manufactureCar("Gv80");
        System.out.println(car.brand);
        System.out.println(car.price);
        System.out.println(car.gasMileage);
        System.out.println(car.tier.price);
//        System.out.println(car.tier.BRAND); //error

        //자동차 테스트
        CarFunction gv80Func = new Gv80(
                "Gv80",
                50000000,
                34,new HankookTier(),
                "Gv80 프로모션"
        );
        gv80Func.breakPedal();
        gv80Func.gasPedal();
        gv80Func.leftSignal();
        gv80Func.rightSignal();

    }
    static Car1 manufactureCar(String carname) {
        if(carname.equals("Gv80")) {
            return new Gv80(
                    "Gv80",
                    50000000,
                    34,new HankookTier(),
                    "Gv80 프로모션"
            );
        } else if (carname.equals("R8")) {
            return new R8(
                    "R8",
                    500000000,
                    31,new HankookTier(),
                    "R8 프로모션"
            );
        } else {
            return null;
        }
    }
}

class Gv80 extends Car1 {
    String promotion;
//    오버로딩한 생성자가 없다면 기본생성자를 컴파일러가 생성해준다. 지금은 오버로딩을 하였기에 기본생성자가 생성 안됨.
    public Gv80(String brand, int price, int gasMileage, Tier tier, String promotion) {   //생성자
        super(brand, price, gasMileage, tier);  //super()는 상속을 받은 자식클래스의 생성자에서 첫번째 줄에 호출해야 한다. super()는 부모클래스의 생성자.
        this.promotion = promotion;
    }

    @Override
    void promotion() {
        System.out.println("Gv80 프로모션: " + promotion);
    }
}

class R8 extends Car1 {
    String promotion;

    //    오버로딩한 생성자가 없다면 기본생성자를 컴파일러가 생성해준다. 지금은 오버로딩을 하였기에 기본생성자가 생성 안됨.
    public R8(String brand, int price, int gasMileage, Tier tier, String promotion) {   //생성자
        super(brand, price, gasMileage, tier);  //super()는 상속을 받은 자식클래스의 생성자에서 첫번째 줄에 호출해야 한다. super()는 부모클래스의 생성자.
        this.promotion = promotion;
    }

    @Override
    void promotion() {
        System.out.println("R8 프로모션: " + promotion);
    }
}

class K9 extends Car1 {
    String promotion;

    //    오버로딩한 생성자가 없다면 기본생성자를 컴파일러가 생성해준다. 지금은 오버로딩을 하였기에 기본생성자가 생성 안됨.
    public K9(String brand, int price, int gasMileage, Tier tier, String promotion) {   //생성자
        super(brand, price, gasMileage, tier);  //super()는 상속을 받은 자식클래스의 생성자에서 첫번째 줄에 호출해야 한다. super()는 부모클래스의 생성자.
        this.promotion = promotion;
    }

    @Override
    void promotion() {
        System.out.println("K9 프로모션: " + promotion);
    }
}
abstract class Car1 implements CarFunction{
    String brand;
    int price;
    int gasMileage;

    Tier tier;  //느슨한 연결

    public Car1(String brand, int price, int gasMileage, Tier tier) {   //생성자
        this.brand = brand;
        this.price = price;
        this.gasMileage = gasMileage;
        this.tier = tier;
    }

    abstract void promotion();
    @Override
    public void breakPedal() {
        System.out.println("브레이크");
    }

    @Override
    public void gasPedal() {
        System.out.println("가속중");
    }

    @Override
    public void leftSignal() {
        System.out.println("좌회전");
    }

    @Override
    public void rightSignal() {
        System.out.println("우회전");
    }
}
//차 부품 필수적인 것 Tier
abstract class Tier {
    int price;
    int windage;

}

class HankookTier extends Tier {
    final String BRAND = "HANKOOK";

    public HankookTier() {
        super.price = 550000;
        super.windage = 36;
    }
}

class kiaTier extends Tier {
    final String BRAND = "KIA";

    public kiaTier() {
        super.price = 460000;
        super.windage = 32;
    }
}
interface CarFunction { //차의 기능.
    void breakPedal();
    void gasPedal();
    void leftSignal();
    void rightSignal();
}