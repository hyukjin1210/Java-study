package ex.later;

import java.util.Arrays;

public class Arrays_prac {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};
        System.out.println("arr= " + arr);  //배열을 출력할 때는 아래의 Arrays.toString를 이용한다.
        System.out.println("arr= " + Arrays.toString(arr)); //정상 출력
        System.out.println("arr2D= " + Arrays.deepToString(arr2D));   //다차원배열은 deepToString를 이용해야 함.

        int[] arr2 = Arrays.copyOf(arr, 5);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);   //copyOfRange()는  from ~ to 의 형태이지만 to는 포함하지 않기때문에 [2,3] 만 출력된다.
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);   //0에서 출발하지만 배열의 길이가 7이 안되기 때문에 7까지의 남는 길이는 09으로 채운다.

        System.out.println("arr2= " + Arrays.toString(arr2));
        System.out.println("arr3= " + Arrays.toString(arr3));
        System.out.println("arr4= " + Arrays.toString(arr4));
        System.out.println("arr5= " + Arrays.toString(arr5));
        System.out.println("arr6= " + Arrays.toString(arr6));

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);    //arr7 배열을 value(9)로 다 채움.
        System.out.println("arr7= " + Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1);   //람다식 1 ~ 6 랜덤난수
        System.out.println("arr7= " + Arrays.toString(arr7));

        for (int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);   //String -> char = tocharArray() 이다. 그 반대인 char -> String = String(char[]) 이다.
        }

        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2));    //다차원배열에서는 deep 사용
        System.out.println(Arrays.deepEquals(str2D, str2D2));    //toString뿐만아니라 Equals 또한 다차원배열에서 비교하려면 deep를 꼭 사용해야 한다.

        char[] char1 = {'A', 'D', 'C', 'B', 'E'};

        System.out.println("char1=" + Arrays.toString(char1));
        System.out.println("index of B = " + Arrays.binarySearch(char1, 'B'));   //binarySearch()를 이용하여 탐색할 때에는 정렬을 반드시 먼저 해준 뒤 사용해야 한다.
        System.out.println("= After sorting =");
        Arrays.sort(char1); //정렬
        System.out.println("char1=" + Arrays.toString(char1));
        System.out.println("index of B = " + Arrays.binarySearch(char1, 'B'));   //이진탐색(binarySearch())는 인덱스기준이기 때문에 1을 리턴

    }
}
