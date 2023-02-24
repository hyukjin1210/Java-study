package day05;
/*
추상 클래스
추상클래스란 미완성 설계도. 미완성 메서드를 갖고 있는 클래스
일반 클래스 와 똑같은데 추상 메서드가 추가된 미완성된 클래스
미완성 메서드 == 추상메서드
추상메서드 는 구현부가 없다.
추상클래스는 다른클래스 작성에 도움을 주기 위한 것이므로 인스턴스 생성이 불가능하다.
추상클래스를 상속받으면 해당 추상클래스에 있는 추상메서드를 전부 재정의 해주어야 한다.
일부만 구현할 경우 class 앞에 abstract를 붙혀서 여전히 추상클래스임을 명시해야 한다.

추상메서드를 어디에 써야하나.
꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우
*/
abstract class Player { //추상메서드를 포함하고 있기 때문에 추상클래스 이다.
    boolean pause;
    int currentPos;

    public Player() {
        this.pause = false;
        this.currentPos = 0;
    }

    abstract void play(int pos);    //추상메서드
    abstract void stop();
}

class AudioPlayer extends Player {  //추상클래스를 상속받음


    public AudioPlayer() {
        super();
    }

    @Override
    void play(int pos) {    //추상메서드를 구현
        System.out.println(pos + "부터 시작");
    }

    @Override
    void stop() {
        System.out.println("정지");
    }
}

class DvdPlayer extends Player {
    public DvdPlayer() {
        super();
    }

    @Override
    void play(int pos) {
        System.out.println("startTo " + pos);
    }

    @Override
    void stop() {
        System.out.println("stop");
    }
}
    public class abstract_prac {
    public static void main(String[] args) {
//        Player p = new Player();    //추상클래스는 객체 생성이 불가능! 이유 = 미완성이기 때문.
        AudioPlayer ap = new AudioPlayer();  //추상클래스가 아니기 때문에 객체 생성 가능.
        ap.play(20);
        ap.stop();
        Player dp = new DvdPlayer();  //추상클래스가 아니기 때문에 객체 생성 가능. 다형성도 가능
        dp.play(15);
        dp.stop();
    }
}
