package Report.day02;

import java.util.Arrays;
import java.util.Scanner;

public class Report4 {
    public static void main(String[] args) {
//5-1. 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하세요. 4번, 5번(완료)
//        int[] arr[];
//        int[] arr = {1,2,3,};
//        int[] arr = new int[5]; //길이가 5인 배열을 선언만 하고 값을 할당하지는 않은상태.
//        int[] arr1 = new int[5]{1,2,3,4,5}; //배열의 길이를 지정해주면서 값도 같이 할당해줄 수는 없다.
//        int arr[5];   //배열을 선언할 때 크기를 지정해줄 수 없다.
//        int[] arr[] = new int[3][];

//5-2. 다음과 같은 배열이 있을 때, arr[3].length의 값은? 정답: 2(완료)
        int[][]arr ={
                {5,5,5,5,5},
                {10,10,10},
                {20,20,20,20},
                {30,30}
        };

//5-3. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하세요.(완료)
        int[] arr3 = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0; i < arr3.length; i++) {
            sum += arr3[i];
        }
        System.out.println("5-3 sum="+sum);
        //예상 결과 : sum=150

//5-4. 2차원 배열 arr에 담긴 모든 총합과 평균을 구하는 프로그램을 완성하세요.(완료)
        int[][] arr4 = {
                { 5, 5, 5, 5, 5 },
                { 10, 10, 10, 10, 10 },
                { 20, 20, 20, 20, 20 },
                { 30, 30, 30, 30, 30 }
        };
        int total = 0;
        float average = 0;

        for (int i = 0; i < arr4.length; i++) { //배열의 길이만큼 도는 for문1
            for (int j = 0; j <arr4[i].length; j++) {   //for문1 의 배열의 길이만큼 도는 for문2
//                System.out.println(arr4[i].length);
//                System.out.println(arr4.length);
//                System.out.println("test[" + i + "][" + j + "] = " + arr4[i][j]);
                total += arr4[i][j];
                average = (float) total / (arr4.length * arr4[i].length);
            }
        }

        System.out.println("5-4 total=" + total);
        System.out.println("5-4 average=" + average);

//5-5. 다음은 1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
//코드를 완성하세요. 다만 Math.random()을 사용했기 때문에 실행 결과 예시와 다를 수 있습니다.
//        int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//        int[] ball3 = new int[3];
//
//        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
//        for (int i = 0; i <= ballArr.length; i++) { //랜덤숫자 3개를 받아와서 중복제거를 한 뒤 할당 해주어야 함.
//            int j = (int) (Math.random() * ballArr.length);
//            int tmp = 0;
//
//            tmp = ballArr[i];
//            System.out.println("tmp=" + tmp);
//            ballArr[i] = ballArr[j];
//            ballArr[j] = tmp;
//            System.out.println(ballArr[i]);
//        }
//
//        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
////        ball3 = Arrays.copyOfRange(ballArr,0,2);
////        System.arraycopy(ballArr,0, ball3,0,3);
//
//        for (int i = 0; i < ball3.length; i++) {
//            System.out.print(ball3[i]);
//        } 이 문제는 왜 여기서 실행하면 컴파일에러가 나는 것인가?? 진짜 전혀 모르겠다.

//5-6. 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다.
//실행결과와 같이 동작하도록 빈 칸을 채우세요.
        String[] words = { "television", "computer", "mouse", "phone" };
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray(); // String을 char[]로 변환

            for (int j = 0; j < question.length; j++) {
                int t = (int) (Math.random() * question.length);
                char tmp = question[i];
                question[i] = question[t];
                question[t] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요 .>", i + 1, new String(question));
            String answer = scanner.nextLine();

            // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
            if (words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.printf("틀렸습니다.%n%n");
        }
    }//main
}//class
class Exercise5_5{
    public static void main(String[] args) {
        int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다

        ball3 = Arrays.copyOfRange(ballArr,0,3);    //문법은 (복사할배열, 시작인덱스,끝낼인덱스)인데 왜 0 ~ 2 가 아닌 0 ~ 3으로 해야하는가
//        System.arraycopy(ballArr,0, ball3,0,3);

        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }
    }//end of main
}//end of class