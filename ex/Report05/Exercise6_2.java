package ex.Report05;

//6-1. 다음과 같은 멤버 변수를 갖는 Student 클래스를 정의하세요.
//타입 : String, 변수명 : name, 설명 : 학생 이름
//타입 : int, 변수명 : ban, 설명 : 반
//타입 : int, 변수명 : no, 설명 : 번호
//타입 : int, 변수명 : kor, 설명 : 국어 점수
//타입 : int, 변수명 : eng, 설명 : 영어 점수
//타입 : int, 변수명 : math, 설명 : 수학 점수


//6-2. 6-1에서 정의한 Student 클래스에 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.
public class Exercise6_2 {

    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        String str = s.info();

        System.out.println(str);
    }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {  //생성자
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info() {
        String info = (name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage());

        return info;
    }

    int getTotal() {
        int getTotal = kor + eng + math;
        return getTotal;
    }

    float getAverage() {
        float tmp = getTotal() / 3.0f;
        float getAverage = Math.round(tmp * 10) / 10f;

        return getAverage;
    }
}

