package ex.day04;

/*
참조변수 super
객체 자신을 가리키는 참조변수.
인스턴스 메서드(생성자)내에서만 존재
조상의 멤버를 자신의 멤버와 구별할 때 사용.
조상의 멤버변수 = super
자신의 멤버변수 = this

*/
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void method() {
        System.out.println("x=" + x);   //자신의 멤버변수
        System.out.println("this.x=" + this.x); //자신의 멤버변수
        System.out.println("super.x=" + super.x);   //조상의 멤버변수
    }
}

public class super_prac {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}
