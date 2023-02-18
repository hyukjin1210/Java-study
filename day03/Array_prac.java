package day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_prac {
    public static void main(String[] args) {
//        List의 생성자
        List<Integer> arr1 = new ArrayList<Integer>();  //크기 미지정 (기본 10)
        ArrayList<Integer> arr2 = new ArrayList<Integer>(10);   //크기 지정
        ArrayList<Integer> arr3 = new ArrayList<Integer>(arr1); //arr1의 크기와 동일하게 생성.

        /*
        ArrayList에 값을 저장 add()
        ArrayList에는 객체(참조형 타입)만 저장가능하다.(즉, int , long 등 기본형타입은 저장할 수 없다)
        auto-boxing에 의해 1을 저장할 경우 int1 이 아닌 Integer1이 저장된다.
         */
        arr1.add(1);

        arr2.add(2);
        arr2.add(3);

        arr3.add(4);
        arr3.add(5);
        arr3.add(6);
        arr3.add(2,7);  //인덱스의 위치를 지정해서 삽입도 가능하다.

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);

//        ArrayList의 크기 size() (일반 배열 에서의 length)반환.
        arr1.size();
        arr2.size();
        arr3.size();
        System.out.println("arr1 size = " + arr1.size());
        System.out.println("arr2 size = " + arr2.size());
        System.out.println("arr3 size = " + arr3.size());

//        리스트 안의 데이터 조회 get()
        Integer a = arr3.get(2);
//        매개변수로 인덱스의 값을 입력하여 해당 인덱스의 원소를 반환.
//        배열에 있는 데이터를 하나씩 꺼낼 때 사용가능
        System.out.println("배열안의 원소 하나만 출력: " + a);
//        for-each문 으로 전부 꺼낼 때 사용
        for(Integer x : arr3){
            System.out.println("배열안의 원소 전부 출력: " + x);
        }

//        리스트 안의 데이터 삭제 remove()
        Integer y = arr3.remove(3); //인덱스 지정가능.
        System.out.println(y);  //삭제한 데이터 출력
        System.out.println(arr3);

//        리스트 안의 데이터 변경 set()
        arr3.set(2,5);  //위치 , 변경 (index , item)
        System.out.println(arr3);

        for (int i = 0; i < arr1.size(); i++) {
            arr1.add(i);
            if(arr1.size() == 10){
                break;
            }
        }
        System.out.println(arr1);

//        리스트 끝에서부터 데이터 지우기
        for (int i = arr1.size() -1; i >= 0; i--) { //시작지점을 리스트의 끝에서 부터 --
            arr1.remove(i);
        }
//        리스트를 끝에서부터 안지우면 데이터가 남는현상이 발생한다, 또한 앞에서 지우고 위로 복사하는 것이기 때문에 성능이 안좋다.
        System.out.println(arr1);


//        List<Integer> list1 = Arrays.asList(1,2,3);
//        System.out.println("test " + list1);
////        list1.add(4);   //에러
//        list1.set(3,6);
//        System.out.println("test " + list1);

        Integer[] list2 = {1,2,3};
        List<Integer> list3 = Arrays.asList(list2);
        list3.set(1,5);
        System.out.println(list3);
    }
}
