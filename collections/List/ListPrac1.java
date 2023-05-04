package collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * List
 * 순서가 있는 집합, 데이터의 중복을 허용한다.
 * 예시) 대기자 명단
 */
public class ListPrac1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 '객체'만 저장 가능.
        // autoboxing에 의해 기본형변수가 참조형으로 자동 변환된다
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1, 4));    // 1<= x < 4 의 형태이므로 1이상 4미만과 의미가 같다. 또한 subList는 읽기 전용이다.
        print(list1, list2);
        // Collection은 인터페이스, Collections는 유틸클래스
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);


    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println();
    }
}
