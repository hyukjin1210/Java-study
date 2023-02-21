package day03;



/*
    객체지향 언어
    객체지향 언어의 장점 : 코드의 재사용성이 높다. 유지보수가 용이하다. 중복코드 제거기능이 있다.
    OOP(Object oriented programing)
    1. 캡슐화
    2. 상속
    3. 추상화
    4. 다형성


    Q. 클래스가 왜 필요한가?
    A. 객체를 생성하기 위해.
    Q. 객체가 왜 필요한가?
    A. 객체를 사용하기 위해.
    Q. 객체를 사용한다는 것은?
    A. 객체가 가진 속성(변수)과 기능(메서드)을 사용하기 위해.
     */
public class Class_prac {

    public static void main(String[] args) {
        Hanghae.study = "2222";
        System.out.println("나는 홍길동입니다. 나는 공부 " + Hanghae.study + "일차 입니다.");
    }
}
