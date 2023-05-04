package ex.day02;

import java.util.Scanner;

public class if_prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 1 입력: ");
        int num1 = scanner.nextInt();

        System.out.print("연산자 입력:");
        String op = scanner.next();

        System.out.print("숫자 2 입력: ");
        int num2 = scanner.nextInt();

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
    }//main
}//class
