package day02;

public class for_prac {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6){
                    System.out.println("i의값: " + i + ", j의값: " + j + ", i 와 j의 합: " + (i + j));
                }
            }
        }
    }//main
}//class
