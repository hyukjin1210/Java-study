package day05;

/*
캡슐화와 접근제어자
접근 제어자를 사용하는 이유
1. 외부로부터 데이터를 보호하기 위해
2. 외부에는 불필요하며, 내부적으로만 사용되는 부분을 감추기 위해
접근 제어자의 범위는 좁을수록 좋다.
*/
class Time {
    private int hour;   //private으로 접근제어자를 두어서 외부접근을 막아준다.
    private int minute; //private 의 허용범위는 해당 클래스 뿐이기 때문이다.
    private int second;

    public int getHour() {  //단순히 읽기만 하는 것이라 상관 x
        return hour;
    }

    private boolean isValidHour(int hour) {
        return hour >= 0 && hour <= 23; //0 ~ 23 의 수
    }

    public void setHour(int hour) { //메서드는 public 으로 해서 외부에서 접근하는 것을 받아들인다. 메서드를 통해서 매개변수에 접근을 하게끔(간접접근 허용)
        if (!isValidHour(hour)) {
            return;
        }

        this.hour = hour;
    }
}

public class TimeTest {

    public static void main(String[] args) {
        Time t = new Time();
//        t.hour = 13;  //사용할 수 없는 이유: 현재 Time클래스의 hour는 private라는 접근 범위가 설정되어있다. TimeTest와 Time는 다른 클래스이며 private는 같은 클래스에서만 사용이 가능하다.
        System.out.println(t.getHour());

        t.setHour(14);
        System.out.println(t.getHour());

        t.setHour(50);
        System.out.println(t.getHour());

    }
}