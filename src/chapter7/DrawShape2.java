package chapter7;

class Shape2{
    String color = "black";
    void draw(){
        System.out.println("color : " + this.color);
    }
}

class Point2{
    int x, y;
    Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point2(){
        this(0, 0);
    }
    String getXY(){
        return "("+x+","+y+")";
    }
}

class Circle2 extends Shape2{
    Point2 p; // 멤버변수는 초기화 직접안해도 자동초기화된다.
    int r; // 반지름

    Circle2(Point2 p, int r){
        this.p = p;
        this.r = r;
    }
    Circle2(){
        this(new Point2(10, 10), 10);
    }
    void draw(){
        System.out.println("중심 : " + p.x + ", " + p.y + ", 반지름  : " + this.r);
    }
}
class Triangle2 extends Shape2{ 
    Point[] p = new Point[3];

    Triangle2(Point[] p){
        this.p = p;
    }

    void draw(){
        System.out.println("각점 : " + p[0].getXY() + ", " + p[1].getXY() + ", " + p[2].getXY());
    }
}

public class DrawShape2 {
    public static void main(String[] args) {
        Point[] p = new Point[]{ // 배열 초기화할때 선언생략안할땐 배열 길이 생략해야됨. 그거까먹엇음.
                new Point(0, 0),
                new Point(10, 10),
                new Point(20, 20),
        };
        Triangle2 t = new Triangle2(p);
        t.draw();

        Circle2 c = new Circle2(new Point2(5, 5), 15);
        c.draw();

        Shape2 s = new Shape2();
        s.draw();
    }
}
// 클래스 간의 관계 포함 vs 상속
// is - a : 상속
// has - a : 포함