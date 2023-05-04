package ex.day05;
/*
매개변수의 다형성
참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.

*/
class product {
    int price;
    int bonusPoint;

    public product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}
class Tv extends product{

    public Tv() {
        super(100);
    }
}
class Computer extends product{

    public Computer(int price) {
        super(price);
    }
}
class Audio extends product{

    public Audio(int price) {
        super(price);
    }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy (product p) {  //매개변수 타입 주목.
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p+ "을/를 구입하셨습니다.");
    }
}

public class polymorphism_prac2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer(200));

        System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다." );

    }
}
