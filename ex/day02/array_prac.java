package ex.day02;

import java.util.Arrays;

public class array_prac {
    public static void main(String[] args) {
        int[] ball = new int[45];
        for (int i = 0; i < ball.length; i++)
            ball[i] = i + 1;
            System.out.println(Arrays.toString(ball));
            int tmp = 0;
            int j = 0;
            for (int i = 0; i < 6; i++) {
                j = (int) (Math.random() * 45);
                tmp = ball[i];
                ball[i] = ball[j];
                ball[j] = tmp;
                System.out.println(Arrays.toString(ball));
            }

            for (int i = 0; i < 6; i++) {
                System.out.printf("ball[%d]=%d%n", i, ball[i]);
            }

    }//main
}//class
