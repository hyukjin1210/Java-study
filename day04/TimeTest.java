package day04;

class Time {
    private int hour;   //0 ~ 23 사이의 값을 가져야 함.
    int minute;
    int second;

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            return;
        }
        this.hour = hour;
    }
    public int getHour() {
        return hour;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t= new Time();
        t.setHour(21);
        System.out.println(t.getHour());
//        t.hour = 25;  /에러가 나는 이유 : Time클래스의 hour변수의 접슨제어자는 private 인데 다른 클래스인 TimeTest에서 사용하려 하였기 때문에 에러
    }
}
