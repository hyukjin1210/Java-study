package later;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_prac {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;
    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        while (true) {
            System.out.println(">>");
            try {
//                화면으로부터 라인단위로 입력받는다.
                Scanner sc = new Scanner(System.in);
                String input= sc.nextLine().trim();

                if ("".equals(input))
                    continue;
                if(input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) { //대소문자 구분없이 비교
                    save(input);    //입력받은 명령어를 저장
                    LinkedList list = (LinkedList) q;

                    final int SIZE = list.size();   //리스트의 길이가 바뀌지않게 final 선언

                    for (int i = 0; i < SIZE; i++) {
                        System.out.println((i + 1) + "." + list.get(i));
                    }
                } else {
                    save(input);
                    System.out.println(input);
                }
            }  catch (Exception e) {
                System.out.println(e.getMessage() + "오류입니다.");
            }
        }
    }
    public static void save (String input) {    //static 메서드로 만드는 이유는 메인메서드에서 사용할 때 객체생성 없이 사용하기 위해서
        if (! "".equals(input)) {   //queue에 저장한다.
            q.offer(input);
        }
        if(q.size() > MAX_SIZE) {
            q.remove(); //poll 과 기능은 같으며 큐는 하나씩 저장하고 하나씩 삭제한다.
        }
    }
}
