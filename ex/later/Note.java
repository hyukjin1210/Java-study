package ex.later;

import java.util.Arrays;
import java.util.Stack;

public class Note {
    public static void main(String[] args) {
//        int 배열을 Integer 배열로 바꾼 뒤 Stack 으로 출력하기
        int[] arr = {1,2,3,4};
        Integer[] in = new Integer[arr.length]; //arr배열의 길이만큼 in배열의 길이를 잡아줌.
        for (int i = 0; i < arr.length; i++) {  //int배열을 Integer배열로 바꿔주는 과정
            in[i] = arr[i];
            System.out.println("Integer배열 in의 값 " + in[i]);
        }
        System.out.println(Arrays.toString(in));    //확인 이상 무.

        Stack<Integer> st1 = new Stack<>();

        for (int i = 0; i < in.length; i++) {
            st1.push(in[i]);
        }
        System.out.println("현재 스택의 길이: " + st1.size());
        while (!st1.empty()) {
            System.out.println("스택 " + st1.pop());

        }
    }
}
