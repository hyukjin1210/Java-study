package Report.day02;

public class Report3 {
    public static void main(String[] args) {

//4-1. 다음의 문장들을 조건식으로 표현해보세요.

//int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
        int x = 15;
        if (x > 10 && x < 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
        char ch = 'A';
        if (ch != 'A' || ch != '\n') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
        char ch1 = 'X';
        if (ch1 == 'x' || ch1 == 'X') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
        char ch2 = '0';
        if (ch2 >= '0' && ch2 <= '9') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
        char ch3 = 'A';
        if (ch3 == 'A' || ch3 == 'a') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을때 true인 조건식
        int year = 2000;
        if (year % 400 == 0) {
            if (year % 4 == 0 || year % 100 != 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
//boolean형 변수 powerOn이 false일 때 true인 조건식
        boolean powerOn = false;
        if (powerOn == false) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
//문자열 참조변수 str이 "yes"일 때 true인 조건식
        String str = "yes";
        if (str.equals("yes")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//4-2. 1부터 20까지의 정수중에서 2 또는 3의 배수가 아닌 수의 총합을 구하세요.(완료)
        int sum = 0;
        int num;
        for (num = 1; num <= 20; num++) {
            if (num % 2 != 0 || num % 3 != 0) { //num을 2로 나누고 난 나머지가 0이 아니면. 또는 3이 아니면.
                sum += num;
            }
        }
        System.out.println("4-2 sum=" + sum);

//4-3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하세요.(완료)
        int sum2 = 0;
        int totalSum = 0;
        for (sum2 = 1; sum2 <= 10; sum2++) {
            totalSum += sum2;
        }
        System.out.println("4-3 totalSum=" + totalSum);

//4-4. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때,
//몇까지 더해야 총합이 100 이상이 되는지 구하세요.
        sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        num = 0;

        for (int i = 0;true; i++) {    //무한반복문으로 만듦
            s =- s;
            num = s * i;
            sum += num;
            if(sum >= 100) {
                break;
            }
        }

        System.out.println("4-4 num=" + num);
        System.out.println("4-4 sum=" + sum);

//4-5. 다음의 for문을 while문으로 변경하세요.(완료)
//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");  //두번째for문으로 인하여 가로줄이 *로 찍힌다.
//            }
//            System.out.println();   //처음for문으로 인하여 세로줄이 찍힌다. 출력구문이 없으면 안된다.
//        }
        int lenth = 0;
        while (lenth <= 10) {
            int width = 0;
            while (width <= lenth) {
                System.out.print("*");  //가로줄을 찍는 while문 width
                width++;
            }
            System.out.println(); //세로줄을 찍는  while문 length
            lenth++;
        }

//4-6. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요.(완료)
        for (int i = 1; i <= 6; i++) {   // 1 ~ 6 까지 도는 for문1
            for (int j = 1; j <= 6; j++) {  //for문1의 1 ~ 6 까지 도는 for문2
                if (i + j == 6) {    //주사위 눈의 합을 찾는 조건
                    System.out.println("4-6 i의값: " + i + ", j의값: " + j + ", i 와 j의 합: " + (i + j));
                }
            }
        }

//4-7. 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하세요.(완료)
//만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되어야 합니다.
        str = "12345";
        sum = 0;
        int ans = Integer.parseInt(str.substring(0, 1)); //문자열에서 1을 추출 후 정수형1로 바꾸어줌
        for (int i = 0; i < str.length(); i++) {
            ans = Integer.parseInt(str.substring(i, i + 1));
            sum += ans;
        }
        System.out.println("4-7 sum=" + sum);
        //예상결과 : sum=15

//4-8. Math.random()을 이용해서 1부터 6 사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하세요.(완료)
        int value = (int) (Math.random() * (6 - 1) + 1);    //Math.random() * (최대값(6) - 최소값(1)) + 최소값(1)) 여기까지 계산하면 double타입이고 double는 실수형 이기 때문에 int로 강제 형변환 후 출력.
        System.out.println("4-8 value:" + value);

//4-9. int 타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하세요.(완료)
//만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하세요.
//문자열로 변환하지 말고 숫자로만 처리하세요.
        num = 12345;
        sum = 0;
//        sum += num % 10; //5
//        num /= 10; //1234
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("4-9 sum=" + sum);
        //예상 결과 : sum=15

//4-10. 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력해서
//컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
//사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
//사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.(완료)
        // 1~100사이의 임의의 값을 얻어서  answer에 저장한다.
        int answer = (int) (Math.random() * (100 - 1) + 1); //랜덤값 할당.
//        System.out.println(answer);
        int input = 0; //사용자입력을 저장할 공간
        int count = 0; //시도횟수를 세기위한 변수

        // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
        java.util.Scanner scan = new java.util.Scanner(System.in);
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");
            input = scan.nextInt(); //입력받은 값을 변수 input에 저장한다.
            if (input == answer) {
                System.out.println("맞혔습니다");
                System.out.println("시도횟수는 " + count + "번입니다.");
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요.");
            } else {
                System.out.println("더 작은 수를 입력하세요.");
            }
        } while (true); //무한반복문

        //예상 결과
        //1과 100사이의 값을 입력하세요 : 50
        //더 큰 수를 입력하세요.
        //1과 100사이의 값을 입력하세요 : 75
        //더 큰 수를 입력하세요.
        //1과 100사이의 값을 입력하세요 : 87
        //더 작은 수를 입력하세요.
        //1과 100사이의 값을 입력하세요 : 80
        //더 작은 수를 입력하세요.
        //1과 100사이의 값을 입력하세요 : 77
        //더 작은 수를 입력하세요.
        //1과 100사이의 값을 입력하세요 : 76
        //맞혔습니다.
        //시도횟수는 6번입니다.

    }//main
}//class
