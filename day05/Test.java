package day05;

class Animal {
    public void cry() {
        System.out.println("울음소리");
    }

    public void walk() {
        System.out.println("걷기");
    }
}

class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("왈왈");
    }

    @Override
    public void walk() {
        System.out.println("성큼성큼");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("슈웅");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog(); //조상타입(Animal)의 참조변수(dog)로 자손타입의 객체(Dog)를 다루는 것.
        dog.cry();
        dog.walk();

        Animal bird1 = new Bird();  //조상타입(Animal)의 참조변수 bird1 으로 새로운(new) 객체(Bird)를 만든다.
        // -> 즉, Bird의 속성을 쓰는것이 아닌 Animal의 속성을 사용할 수 있다.

//        bird1.fly();  사용할수 없는 이유: 조상타입(Animal)에는 fly라는 메서드가 없다. 때문에 사용하려면 참조변수(bird1)의 형변환이 필요하다.

        Bird bird2 = (Bird) bird1;  //Bird타입의 bird2라는 참조변수를  new Bird()로 객체를 생성하는 것이 아닌 bird1으로 만든다.
        bird2.cry();
        bird2.walk();
        bird2.fly();
    }
}
