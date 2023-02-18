package LV_2;

import java.util.List;

public class solution2 {
    public static void main(String[] args) {
        solution1 solution1 = new solution1();
        List<Integer> integers = solution1.method1(1,1,6);
        System.out.println(integers);   //배열 그대로 확인

        for(int a : integers) {
            System.out.println("배열의 원소 추출 = " + a);
        }

    }
}
