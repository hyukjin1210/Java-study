package day03;

public class Hanghae {
    String name;    //인스턴스 변수(iv)
    int day;
    String stack;
    static String study;    //클래스 변수

    int math;
    int science;
    int music;

    public Hanghae(String name, int math, int science, int music) { //생성자
        this.name = name;
        this.math = math;
        this.science = science;
        this.music = music;
    }

    public void info(String name, int day, String stack) {  //리턴 타입이 없는 메서드
        System.out.println("안녕하세요 저는 " + name + "입니다 오늘은 항해시작 "
                + day + "일차이며, 저의 주특기는 " + stack + " 입니다.");
    }

    public int score(int math, int science) { //리턴 타입이 있는 메서드
        int result = (math + science) / 2;

        return result;
    }

    public int score(int math, int science, int music) { // 메서드 오버로딩
        int result = (math + science + music) / 3;

        return result;
    }

    public void info() {  //리턴 타입이 없는 메서드 오버로딩
        System.out.println("안녕하세요 저는 " + name + "입니다 제 시험점수는 "
                + "수학: " + math + " 과학: " + science + " 음악: " + music + "점 이며, 저의 시험 평균은 " + score() + " 입니다.");
    }
    public int score() { // 메서드 오버로딩
        int avg = (math + science + music) / 3;

        return avg;
    }

    public static void main(String[] args) {
//        Hanghae hh = new Hanghae(); //객체 생성 생성자가 있으면 이렇게는 사용이 안됨.
        Hanghae hh = new Hanghae("sam", 50, 80, 20); //객체 생성

        hh.name = "장혁진";    //이름 변경
        study = "12";
        System.out.println("저는 " + hh.name + "입니다. 오늘은 공부 " + study + "일차 입니다.");

        hh.info("장혁진", 2, "java");    // info()메서드 호출

        hh.score(50, 70);    //이 메서드가 출력이 안되는 이유.
        System.out.println(hh.score(50, 70));

        int myScore = hh.score(90, 70);  //변수에 저장
        System.out.println("저의 시험평균은 " + myScore + " 입니다. 저는 음악시험을 치루지 않았습니다.");

        hh.score(80, 80, 20);
        System.out.println("저는 이과생입니다.... 저의 시험평균은 " + hh.score(80, 80, 20) + "점 이지만..."
                + "저의 음악점수가 " + hh.music + "점 이여서 평균점수가 낮습니다..");

        Hanghae bob = new Hanghae("bob", 20, 50, 100); //객체 생성
        bob.info();
//        System.out.println(bob.info()); //이 메서드가 출력이 안되는이유.

    }
}
