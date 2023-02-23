package day05;

/*
참조변수의 형변환
사용할 수 있는 멤버의 개수를 조절하는 것.
조상 자손 관계의 참조변수는 서로 형변환 가능.

instanceOf
 */
public class ReferenceCast_prac {
    public static void main(String[] args) {
        FireEngine f = new FireEngine();   //참조타입 일치
        Car c = (Car) f;    //자손인 f타입은 조상인 Car타입으로 형변환 가능 (생략가능)
        FireEngine f2 = (FireEngine) c; //가능. 참조타입이 불일치하기 때문에 형변환 생략 불가능

        Car car = null;
        FireEngine fe = new FireEngine();

        fe.color("red");    //이건 fe가 형변환을 하지 않는 객체니까 당연히 가능하다.

        fe.water();
        FireEngine fe2 = null;
        car = fe;   //car = null로 선언을 위에서 하였기에 현재 car 와 fe의 주소는 같다.
//        car.water();    //안되는 이유: Car클래스에 water()메서드가 정의되어있지 않다. car = fe로 같게 만들어준 것은 주소뿐 Car의 멤버에는 water()가 없다.
//        Car 타입의 참조변수로는 water()를 호출할 수 없다.

        car.color("black"); //이 메서드가 실행되는이유가 형변환을 하는 이유.
        fe2 = (FireEngine) car; //멤버개수가 5개인 FireEngine 으로 멤버개수가 4개인 Car를 바꾸는 것은 형변환 생략이 불가능하다.
        fe2.water();

    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("주행");
    }

    void stop() {
        System.out.println("정지");
    }

    void color(String color) {
        this.color = color;
    }
}

class FireEngine extends Car {

    void water() {
        System.out.println(color);
        System.out.println("무울");
    }


}