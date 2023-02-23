package later;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator_prac {
    /*
    Comparable : 기본 정렬기준을 구현하는데 사용.
    Comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용
    정렬 Arrays.sort(정렬대상,정렬기준)이 표준이다.
    */
    public static void main(String[] args) {
        String[] str = {"cat", "Dog", "lion", "tiger", "rabbit"};

        Arrays.sort(str);   //기본정렬 String클래스의 Comparable인터페이스 구현에 의한 정렬이기 때문에 sort(정렬대상, 정렬기준)에서 기준을 생략해도 된다.
        System.out.println("str =" + Arrays.toString(str)); //정렬을 하지만 Dog가 대문자이기 때문에 첫번째로 출력됨

        Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);    //대소문자 구분 안함
        System.out.println("str =" + Arrays.toString(str));

        Arrays.sort(str, Comparator.reverseOrder()); //역순 정렬
        System.out.println("str =" + Arrays.toString(str));

        Arrays.sort(str, new Descending()); //역순 정렬2
        System.out.println("str =" + Arrays.toString(str));

    }
}

class Descending implements Comparator {    //새로운 정렬기준을 만든 것. 인터페이스Comparator 를 구현.
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;   //* -1을 하였으므로 양수 -> 음수, 0 -> 0, 음수 -> 양수 가 되어서 역순정렬이 된다
        }
        return -1;
    }
}