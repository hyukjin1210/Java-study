package day06;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack_prac {
    public static void main(String[] args) {
        /*
        스택의 활용 예 - 수식계산, 수식괄호검사, 워드프로세서의 undo, redo
         */
//        스택을 이용한 수식검사(괄호검사)
        Stack st = new Stack();
        String expression = "((3 + 5) * 8 - 2)";
        System.out.printf("expression: " + expression);
        try {
            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);  //for문안에서 한글자씩 꺼내는 작업
                if (c == '(') {
                    st.push(c + "");
                } else if (c == ')') {
                    st.pop();
                }
            }
            if(st.isEmpty()) {
                System.out.printf("괄호가 일치합니다.");
            } else {
                System.out.printf("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage() + "예외발생");
        }
    }
}
