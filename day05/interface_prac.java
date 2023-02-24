package day05;
/*
인터페이스

인터페이스란?
-추상메서드의 집합 (메서드가 전부 추상메서드인 것.)
구현된 것이 없는 설계도 (모든 멤버가 public)

추상클래스와 인터페이스의 차이가 무엇인가?
추상클래스는 일반 클래스 + 추상메서드 의 형태이지만
인터페이스는 추상메서드 외의 모든 것을 가지고 있지 않은 것 입니다.(멤버변수를 가질 수 없다)
인터페이스의 조상은 인터페이스만 가능하다.
다중상속이 가능하다 (추상메서드는 충돌해도 문제 없음)

*/
public class interface_prac {
}
interface play {
    void start();
    public abstract int chanal();   //public 와 abstract는 생략이 가능.

}