package day04;
/*
제어자 (modifier)
접근제어자 : public, protected, (default), private
그 외 : static, final, abstract ...
*/
public class modifier_prac {
    public static final int WIDTH = 200;

    static int max (int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        modifier_prac mod = new modifier_prac();
        mod.max(2,6);
        System.out.println("WIDTH = " + WIDTH);
    }
}
