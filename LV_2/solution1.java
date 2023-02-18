package LV_2;

import java.util.ArrayList;
import java.util.List;

public class solution1 {
    public List<Integer> method1(int x, int y, int z) {
        int num = 0;
        List<Integer> list1 = new ArrayList<>();

        if (x == y) {
            for (int i = 0; i < z; i++) {
                list1.add(i);
            }
            return list1;
        }

        if (z == 7) {

            for (int i = 0; i < z; i++) {
                list1.add(i);
            }
        }
        return list1;
    }

    public static void main(String[] args) {

    }
}
