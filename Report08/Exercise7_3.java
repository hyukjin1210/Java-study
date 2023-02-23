package Report08;
/*
7-3. 다음의 코드는 컴파일하면 에러가 발생한다.
그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?

정답 : 자손클래스인 Tv 에서 super()를 이용해 조상클래스의 생성자를 불러와야 한다.
또한 price를 파라미터로 받아서 사용하기 때문에 메인 메서드에서 파라미터로 값을 지정해서 넘겨주어야 한다.
*/
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    public Tv(int price) {
        super(price);
    }

    public String toString() {
        return "Tv";
    }
}

class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv(1000000);
        System.out.println(t.bonusPoint);
    }
}