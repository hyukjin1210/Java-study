package collections.Map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * key와 값을 하나로 묶은 것이 entry이며 entrySet을 사용한다.
 */
public class Map_prac {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "HyukJin");  //map은 .put를 이용해 데이터를 저장한다.(List에서의 .add)
        map.put("password", "123");
        System.out.println(map);
        map.put("password", "1234");    //key 값이 같지만 value값이 다른경우 value값이 수정되어 저장된다.
        System.out.println(map);
        map.get("myId");  //.get을 이용해 저장한 id값을 찾을 수 있다.
        System.out.println(map.get("myId"));

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해 주세요.");
            System.out.print("id :");
            String id = s.nextLine().trim();

            System.out.print("password :");
            String password = s.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            if (!map.get(password).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}
/**
 * 맵의 특징
 * key, value 로 묶어서 사용한다.
 * 키 = 중복 x
 * 밸류 = 중복 o
 * ex) id, password
 * id 는 중복이 되면 안되지만 password는 중복이 되어도 상관이 없다.
 * HashMap과 TreeMap
 * HashMap 특징
 * 해싱(hashing)기법으로 데이터를 저장. 데이터가 많아도 검색이 빠르다.
 * Map 인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장
 * TreeMap 특징
 * 범위 검색과 정렬에 유리한 컬렉션 클래스
 * HashMap보다 데이터 추가, 삭제에 시간이 더 걸림(이유: 비교해가며 저장하기 때문)
 * TreeMap은 TreeSet과 같은 특성을 가진다.
 */