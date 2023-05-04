package ex.Report.day01;

public class Report2 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        //3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오) 4번, 5번
        b = (byte) i;
        ch = (char) b;
        short s = (short)ch;
        float f = (float)l;
        i = (int)ch;

        //3-2. 다음 연산의 결과와 그 이유를 적으세요.
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        System.out.println((int) c);


        System.out.println(y >= 5 || x < 0 && x > 2);   //true 이유: y >= 5가 true이고 ||연산자가 있으므로 식 중 하나만 참이면 '참'이기 때문
        System.out.println(y += 10 - x++);  //y = y(5) + 10 이므로 15 x는 x++이므로 현재 2 즉, 15 - 2 = 13
        System.out.println(x += 2); //위 구문에서 x++로 인하여 현재 x의값(3) 즉, 3 + 2 = 5
        System.out.println(!('A' <= c && c <= 'Z'));    //'A' = 65이며 65 <= 65 이며 65 <= 90으로 맞는 연산이지만 맨 앞에 !로 연산을 부정하기 때문에 false
        System.out.println('C' - c);    //'A' = 65 즉, 67 - 65 = 2
        System.out.println('5' - '0');
        System.out.println(c + 1);  // 65 + 1 = 66
        System.out.println(c);  // 이건 왜 'A'인 것인가?
        System.out.println(++c);    // B
        System.out.println(c++);    // B
        System.out.println(c);  // C

        //3-3. 아래는 변수의 num 값 중에서 백의 자리 이하를 버리는 코드이다.
        //만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
        //알맞은 코드를 넣으시오.
        int num = 456;
        System.out.println((num/ 100) * 100);   // num / 100 = 4 * 100 = 400
        //예상 결과 -> 400

        //3-4. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
        //만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
        //알맞은 코드를 넣으시오.

        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfBucket = numOfApples / sizeOfBucket == 13 ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1;   //삼항연산자 사용.
        System.out.println("필요한 바구니의 수 :"+numOfBucket);
        //예상 결과 -> 필요한 바구니의 수 :13

        //3-5. 아래는 변수 number의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
        //삼항연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
        //Hint : 삼항 연산자를 두 번 사용할 것!
        int number = 10;
//        number < 0 ? System.out.println("음수") :  number == 0 ? System.out.println("0입니다.") : System.out.println("양수");
        System.out.println( number < 0 ? "음수" : number == 0 ? "0입니다." : "양수");  //중첩 삼항연산자 사용
        //예상 결과 : 양수

        //3-6. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
        //변환 공식이 'C = 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오.
        // 단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것!
        int fahrenheit = 100;
        float celcius = ((int) ((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f);
//        float celcius = (float) 5 / 9 * (fahrenheit - 32);
        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.println("Celcius: " + celcius);
//        System.out.printf("Celcius %.2f" , celcius);
        //예상 결과 : Fahrenheit:100, Celcius:37.78


    }//main
}//class
