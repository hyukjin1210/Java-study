package day01;

public class Q1 {
    public static void main(String[] args) {
//        상수'final'
//        상수 final 은 값을 할당하면 재할당 할 수 없는 변하지 않는 변수 입니다.
        int number = 100;
        final int num = 200;
        System.out.println(number);
        System.out.println(num);
        number = 150;
//        num = 150;  //error이유: 상수 final은 값을 할당하면 변경시킬 수 없다!
        System.out.println(number);

        char c = 'A';
        int i = 5;
        System.out.println(c + i);

        String Q1 = "5";
        System.out.println(Q1 + i);


    }//main
}//class
