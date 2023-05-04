package ex.day05;
/*
instanceof 연산자
참조변수의 형변환 가능여부 확인에 사용! 가능하면 true 반환
형변환을 하기전에 형변환을 해도 되는지 확인을 위해 사용함.

*/
public class instanceOf_prac {
    void dowork(Car c) {
        if (c instanceof FireEngine) {
            FireEngine fe = (FireEngine) c; //형변환을 하는이유: 멤버개수가 4개인 Car클래스가 멤버개수가 5개인 FireEngine의 기능을 모두 사용하기 위해.
            fe.water();
        }
    }
    public static void main(String[] args) {

    }
}
