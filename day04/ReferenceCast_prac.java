package day04;

/*
참조변수의 형변환
참조변수의 형변환을 하는이유 : 참조변수를 변경함으로써 사용할 수 있는 멤버의 개수를 조절하기 위해

instanceOf
 */
public class ReferenceCast_prac {
    public static void main(String[] args) {

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
}

class FireEngine extends Car{

    void water() {
        System.out.println("무울");
    }
}
////        Car car = null;
////        FireEngine fe = new FireEngine();
////        FireEngine fe2 = null;
//        Car car = new Car();    //일반적인 인스턴스 생성.
//        FireEngine fe = new FireEngine();
////        FireEngine fe2 = (FireEngine) car;  //컴파일 에러는 안나지만 사용이 안된다.
////        fe2.water();    //실제 인스턴스는 car의 객체이기 때문에 water()는 사용이 불가능하다.
//
//        Car fe3 = new FireEngine();
//        fe3.drive();
//
////        car = fe;   //car = 조상 , fe = 자손 이기때문에 자동 형변환이 된다. car = (Car)fe;
////        car.water();    //에러가 나는 이유 : Car타입의 참조변수로는 water()를 호출할 수 없다. car은 부모클래스이고 fe는 자식클래스인데 부모클래스가 자식클래스의 메서드를 사용할 수 없는것과 같음
//
////        fe2.drive();