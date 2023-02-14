package Report.day01;

public class Report1 {
    public static void main(String[] args) {
//2-4. 다음 중 변수를 잘못 초기화 한 것은? 1, 2, 3,4
//        byte b = 256;   //byte의 저장범위 초과
//        char c = '';    //문자형은 공백 저장불가능
//        char answer = 'no'; //문자형은 문자 '한개'만 저장가능
//        float f = 3.14;  //실수형 f 는 접미사로 f를 꼭 붙여주어야 함.
        double d = 1.4e3f;


//2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, '오류' 라고 적으세요.
        System.out.println("1" + "2");  //문자 "1"과 "2"를 붙여놓은 형태 "12"
        System.out.println(true + "");
        System.out.println('A' + 'B');  //char'A' = 유니코드65, char'B' = 유니코드66 따라서 65 + 66 으로 자동형변환
        System.out.println('1' + 2);    //char'1' = 유니코드 49, 정수형 2 = int 2 따라서 49 + 2
        System.out.println('1' + '2');  //char'1' = 유니코드 49, char'2' = 유니코드 50 따라서 49 + 50 = 99
        System.out.println('J' + "ava"); //문자형과 문자열의 계산이므로 문자열 Java를 출력
//        System.out.println(true + null);    //오류 말이안되는 문법


//2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
        int x = 1;
        int y = 2;
        int z = 3;

//         풀이과정
        int temp;   //정수형 변수 temp라는 메모리 공간을 할당.
        temp = x;   //먼저 x의 값(1)을 temp에 할당함 현재 temp의 값(1)
        x = y;  //그 다음 y(2)의 값을 x에게 할당함 현재x의 값(2)
        y = z;  //그 다음 z(3)의 값을 y에게 할당함 현재y의 값(3)
        z = temp;   //그 다음 temp(1)의 값을 z에게 할당함 현재z의 값(1)

//        출력결과
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        //예상 결과 : x=2, y=3, z=1
    }//main
}//class
