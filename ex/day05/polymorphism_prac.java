package ex.day05;

/*
다형성(polymorphism)
조상 타입 참조 변수로 자손 타입 객체를 다루는 것.
조상타입에는 없고 자식타입만 가지고있는 속성은 사용할 수 없다.
 */
public class polymorphism_prac {
    public static void main(String[] args) {
//        Q1. 참조변수의 타입은 인스턴스의 타입과 반드시 일치해야 하나요?
//        A1. 아닙니다. 일치하는 것이 보통이지만 일치하지 않을수도 있습니다. 이것이 다형성.
        Dog dog1 = new Dog();   //참조변수와 인스턴스의 타입이 일치
        Animal dog2 = new Dog();    //조상타입 참조변수로 자손타입 인스턴스 참조

//        Q2. 참조변수가 조상타입일 때와 자손타입일 때의 차이?
//        A2. 참조변수로 사용할 수 있는 멤버의 개수가 달라집니다.
        Animal bird1 = new Bird();  //Animal의 멤버 개수: 2개(cry(), walk() / Bird의 멤버 개수 : 3개(cry(), walk(), fly())
        Bird bird2   = new Bird();

//        Q3. 자손타입의 참조변수로 조상타입의 객체를 가리킬 수 있나요
//        A3. 아니요 허용되지 않습니다.
        Animal dog3 = new Dog();    //허용 조상 -> 조상타입(Animal)의 참조변수(dog3)로 자손타입(Dog)의 객체를 가리키는 형태
//        Dog dog4 = new Animal();    //에러 자손타입(Dog)의 참조변수(dog4)로 조상타입(Animal)의 객체를 가리키는 형태

    }
}
