package ex.later;


import java.util.ArrayList;
import java.util.Collections;

public class List_prac {
    public static void main(String[] args) {
//        ArrayList
        ArrayList arr = new ArrayList(10);  //길이 10의 어레이리스트 생성
        arr.add(5); //ArrayList에는 객체만 저장가능
//        int , long, float, double , char 등 기본형(Primitive)타입은 저장 할 수 없다.
//        Integer , String 등의 참조형(Reference)타입만 저장이 가능하다.
//        auto-boxing에 의해 기본형타입이 참조형타입으로 자동 변환된다.
//        때문에 arr.add(5); 를 하더라도 기본형으로 저장되는 것이 아닌 컴파일러에 의해 add.(new Integer(5)) 이런식으로 저장된다.
        arr.add(4);
        arr.add(2);
        arr.add(10);
        arr.add(7);
        arr.add(1);

        ArrayList arr2 = new ArrayList(arr.subList(1,4));   // 1<= arr < 4 인 셈이며 subList()는 읽기전용이다.
        System.out.println("---요소 추가, subList() 확인---");
        System.out.println("arr = " + arr + "\n" + "arr2 = " + arr2 + "\n");
//        System.out.println("----------------------------");


        Collections.sort(arr);  //오름차순 정렬
        Collections.sort(arr2);
        System.out.println("---정렬---");
        System.out.println("arr = " + arr + "\n" + "arr2 = " + arr2 + "\n");

        System.out.println("arr.containsAll(arr2): " + arr.containsAll(arr2));  //true
//        A containsAll(B)은 A안에 B의 내용이 포함되어있는지 묻는 함수이며 반환타입이 boolean이라 true/false를 반환한다.
        arr2.add("C");
        arr2.add("A");
        arr2.add(3,"Q");    //요소를 추가할 위치(index)도 지정이 가능하다. 하지만 좋은방법은 아니다.
        System.out.println("---arr2배열에 요소추가---");
        System.out.println("arr = " + arr + "\n" + "arr2 = " + arr2 + "\n");

        arr2.set(3,"SIU");  //arr2의 3번index인 Q를 SIU로 치환.
        System.out.println("---arr2배열의 3번인덱스Q를 SIU로 치환---");
        System.out.println("arr = " + arr + "\n" + "arr2 = " + arr2 + "\n");

        arr.add(0,"8"); //arr배열의 0번인덱스에 문자열"8"을 추가
        System.out.println("---Integer배열에 String요소 추가-");
        System.out.println("arr배열의 0번index에 문자열8추가 " +arr + "\n");    //현재 0번인덱스는String, 다른 인덱스는 Integer이다.
        System.out.println("index= " + arr.indexOf(7));
        System.out.println("index= " + arr.indexOf(4));    //ArrayList에서는 indexOf로 다 찾을 수 있다.
        System.out.println("arr = " + arr + "\n" + "arr2 = " + arr2 + "\n");

        arr.remove(0);  //컬렉션의 타입을 정해주지 않았기 때문에 타입에 얽매이지 않는다.(String, Integer 구분이 없다.)
        arr.remove(new Integer(0)); //굳이 new연산자를 사용할 필요가 없다.
        System.out.println("---배열의 요소 삭제---");
        System.out.println("arr = " + arr + "\n" + "arr2 = " + arr2 + "\n");

        arr.retainAll(arr2);
        System.out.println("---배열의 겹치는 부분만 남기고 나머지 삭제 (교집합) ---");
        System.out.println("arr = " + arr + "\n" + "arr2 = " + arr2 + "\n");


        for (int i = arr2.size() -1; i >= 0; i--) { //i는 (배열의길이 -1) 이며 i가 0이 될 때까지 arr2 에서 arr에 포함된 객체들을 삭제.
            if (arr.contains(arr2.get(i))) {    //contains()로 arr배열에 arr2의 get(i)가 포함되어있는지 체크 후 true/false 리턴.
                arr2.remove(i);
            }
        }
        System.out.println("---배열의 요소 삭제 contains() 사용---");
        System.out.println("arr = " + arr + "\n" + "arr2 = " + arr2 + "\n");

        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        System.out.println(arr3.size());
        for (int i = 0; i < arr3.size(); i++) {
            arr3.add(i);
            System.out.println(arr3);
        }

    }
}
/*
리스트의 특징
저장순서가 있는 데이터의 집합. 데이터의 중복을 허용한다.
Ex) ArrayList, LinkedList
 */