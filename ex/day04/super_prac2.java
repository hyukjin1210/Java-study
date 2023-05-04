package ex.day04;

/*
조상의 생성자 super()
조상의 생성자를 호출할 때 사용
조상의 멤버는 조상의 생성자를 호출해서 초기화
참조변수 super 와는 관계가 없다.
this()의 상속버전.
모든 생성자는 첫줄에 다른 생성자를 호출 해야한다.
*/
public class super_prac2 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 4);  //매개변수 목록
        System.out.println(p3.getLocation());
    }
}

class MyPoint { //조상클래스
    int x;  //멤버변수
    int y;

    public MyPoint(int x, int y) {  //생성자
        this.x = x;
        this.y = y;
    }
//    public MyPoint() {  //생성자
//    }

    String getLocation() {
        return "x: " + x + ", y: " + y;
    }
}

class Point3D extends MyPoint {
    int z;

//    public Point3D(int x, int y, int z) { //만약 조상클래스의 생성자로 생성하는 인스턴스의 매개변수가 없는경우는 이렇게 사용이 가능.
//        this.z = z;
//    }
    public Point3D(int x, int y, int z) {
        super(x, y);    //super()로 조상 생성자를 불러옴. super()을 사용하지 않을경우 메인메서드의 매개변수목록인 x 와 y 를 정의해줄 수 없어서 에러가 발생함.
        this.z = z;
    }

    @Override
    String getLocation() {
        return "x: " + x + ", y: " + y + ", z: " + z;
    }
}
