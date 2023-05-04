package ex.day01;

public class chap02_literal {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println((int) c);
        System.out.println(c + 1);  //휘발성 데이터.
        System.out.println((int) c);
        System.out.println(++c);    //증감연산
        System.out.println(c);  //증감연산은 휘발성 데이터가 아니다?
    }//main
}//class
