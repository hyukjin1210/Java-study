package ex.day01;

public class chap01 {

    public static void main(String[] args) {
//        기본형 변수 - '정수형'
//        정수형 변수의 종류: byte, short, int, long
//        byte < short < int < long 순으로 저장할 수 범위가 커지며 보편적으로 int(약 20억)을 사용한다.
        byte byte1 = 100;
//        byte byte2 = 128; //error 이유: 정수형변수 byte의 저장 범위는 -128 ~ 127 이기때문에 범위초과 에러.
        short short1 = 100;
//        short short = 100;  //error 이유: 정수형 '타입' short 변수이름 short 타입과 변수이름은 같을 수 없다.
        int int1 = 100;
        long long1 = 100L;    //보편적으로 int를 많이 사용하며 그 이상의 '정수'값을 원할 때에는 long을 사용한다. 또한 접미사로 L(대문자)를 붙여준다.
//        정수형 long는 접미사를 사용하지 않아도 되지만 int의 범위를 초과하면 L을 꼭 붙여주어야 한다.

//       기본형 변수 - '실수형'
//       실수형 변수의 종류: float, double
//        float < double 순으로 저장할 수 있는 범위가 커진다.
        float float1 = 1.5f;
//        float float2 = 1.5; //error 이유: 실수형변수 float는 선언을 할 때 접미사로 f를 붙혀주어야 한다.

        double double1 = 1.4;
        double double2 = 1.4;   //에러가 안나는 이유:float과 double는 같은 실수형 변수이지만, 기본이 double이기때문.
        double double3 = 1.4f;  //에러가 안나는 이유: double는 float의 값의 범위를 포함하고 있기 때문에 접미사를 붙혀도double로 인식한다.

//        기본형 변수 - '논리형(boolean)'
//        논리형 변수의 종류: boolean
//        논리형 변수 boolean은 true / false 둘중 하나만 반환하며, 기본값은 false다.
        boolean true1 = true;
        boolean true2;
//        boolean true3 = 10; //error이유: 논리형변수 boolean은 true 또는 false 만 결과값으로 반환하기 때문.

//        기본형 변수 - '문자형'
//        문자형 변수의 종류: char
//        문자형 변수는 문자 하나만을 저장할 수 있으며 문자를 정수(유니코드)로 저장하므로 정수형, 실수형 과 연산이 가능하다.
        char char1 = 'A';
//        char char2 = "A";   //error이유: 문자형변수 char은 쌍따옴표(" ") 가 아닌 홀따옴표(' ')로 묶어주어야 한다.
//        char char3 = 'AA';  //error이유: 문자형변수 char은 문자 한개 만을 저장할 수 있다.
//        char char4 = '';  //error이유: 문자형변수 char은 공백의 값을 담을 수 없다.


    }//main
}//class
