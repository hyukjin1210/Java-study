package generics;

import java.util.ArrayList;

public class Generics_prac {
    /* 제네릭스란
    *
    */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add("30");
        Integer i = (Integer) list.get(2);
        System.out.println(i);


    }
}
