package ex.Report07;

/*
메서드명 : shuffle
기능
주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
처리한 배열을 반환한다.
반환타입 : int[]
매개변수 : int[] arr - 정수값이 담긴 배열
*/
class Exercise6_17 {

    static int[] shuffle(int[] original) {
        int[] arr = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            int ran = (int) (Math.random() * original.length);
            int tmp = original[ran];
            original[ran] = original[i];
            original[i] = tmp;
        }
        return original;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
