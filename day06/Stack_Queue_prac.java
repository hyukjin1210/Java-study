package day06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue_prac {
    public static void main(String[] args) {
        /*
        스택(Stack)은 후입선출 의 구조다 LIFO(last in first out) Ex)밑이 막힌 상자
        저장 = push
        추출 = pop
        배열에 적용하기 적합하다.

        큐(Queue)는 선입선출 의 구조다 FIFO(first in first out) Ex) 줄서기
        저장 = offer
        추출 = poll
        링크드리스트에 적용하기 적합하다.
        new Queue 를 사용하지 못하는 이유 : 큐는 인터페이스이다. 자바에서 인터페이스는를
         */
        Stack<Integer> st = new Stack<>();

//        empty() : 스택이 비어있는지 알려준다. boolean 타입
        st.empty();
        System.out.println(st.empty());

//        push : 스택에 객체를 저장함.
        st.push(1);
        st.push(2);
        st.push(3);

//        pop : 스택의 맨 위에 저장된 객체를 꺼냄. 비어있으면 익셉션 발생!
        System.out.println(st.pop());

//        peek() : 맨 위에 저장된 객체를 반환 pop()과 달리 객체를 꺼내지않고 보기만 함. 비어있으면 익셉션 발생!
        System.out.println(st.peek());

//        search : 스택에 저장된 객체를 찾아서 그 위치를 반환, 못찾으면 -1을 반환 (배열과 달리 0이 아닌 1부터 시작)
        System.out.println(st.search(2));

//        큐는 인터페이스이다. 때문에 객체생성이 불가능하다.
        Queue<Integer> que = new LinkedList<>();

//        offer() : 큐에 객체를 저장. true/false 를 반환
//        add() : 링크드리스트의 속성인 add()도 사용가능하다. 객체를 저장. 저장공간이 부족하면 익셉션 발생
        que.offer(1);
        que.offer(2);
        que.offer(3);

//        poll() : 큐에서 객체를 꺼냄. 비어있으면 null을 반환
//        remove() : 링크드리스트의 속성인 remove()도 사용가능하다. 객체를 꺼내서 반환. 비어있으면 익셉션 발생
        System.out.println(que.poll());

//        peek() : 삭제없이 읽어온다 큐가 비어있으면 null을 반환
//        element() : 큐에서 객체를 꺼내 반환. 비어있으면 익셉션 발생
        System.out.println(que.peek());



        }
    }

