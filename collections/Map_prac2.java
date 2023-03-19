package collections;

import java.util.*;

public class Map_prac2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("김자바",90);
        map.put("이자바",100);
        map.put("장자바",80);
        map.put("박자바",70);

        Set set = map.entrySet();   //entrySet을 이용해 맵에 저장된 데이터를 불러올 수 있다.
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e  = (Map.Entry)it.next();
            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet(); //key 값을 배열로 가져올 수 있다.
        System.out.println("참가자 명단: " + set);

        Collection values = map.values();   //맵에 저장되어있는 value의 값을 가져오기 위해서는 반환타입이 Collection이여야 한다.
        it = values.iterator();

        int total = 0;
        while (it.hasNext()) {
            int i = (int) it.next();
            total += i;
        }

        System.out.println("총점 :" + total);
        System.out.println("평균 :" + (float)total/set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));
    }
}
