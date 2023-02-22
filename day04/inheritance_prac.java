package day04;
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
class Circle {  //포함
    Point p;
    int r;

    public Circle(Point point, int r) {
        this.p = point;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "p.x=" + p.x + ", p.y=" + p.y +
                ", r=" + r +
                '}';
    }
}
public class inheritance_prac {
    public static void main(String[] args) {
        Point point = new Point(1,2 );
        Circle cc = new Circle(point,2);
        System.out.println(cc);
    }
}
