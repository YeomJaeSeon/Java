package chapter7;

public class DrawShape {
    public static void main(String[] args) {
        Circle c = new Circle(new Point(100, 100), 150);
        c.draw();

        Point[] p = new Point[]{
                new Point(10, 10),
                new Point(20, 20),
                new Point(25, 30),
        };
        Triangle t = new Triangle(p);
        t.draw();
        
    }
}
class Shape{ // 도형 클래수
    String color = "rainbow";

    void draw(){
        System.out.println("색깔 : " + color);
    }
}
class Point{
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point(){
        this(0, 0);
    }
    String getXY(){
        return "(" + x + "," + y + ")";
    }
}
class Circle extends Shape{
    // 원은 도형이다 - 상속관게, Circle인스턴스 생성하면 Circle멤버와 Shape멤버를 모두 사용할수있음
    Point p; // 원은 점을 가지고있다. - has - a 포함관계 , Circle클래스에서 Point 클래스 타입의 멤버변수생성
    // 클래스간의 관계 상속 vs 포함관계
    int r; // 반지름

    Circle(Point p, int r){
        this.p = p;
        this.r = r; // 생성자
    }
    Circle(){
       this(new Point(0, 0), 10);
    }

    void draw(){
        System.out.println("색깔 : " + color + "중심 : " + p.getXY() + "반지름 : " + r);
    }
}
class Triangle extends Shape{
    //삼각형은 도형이다. is -a 상속관계
    Point[] p = new Point[3]; // 객체배열 선언과 생서만함 초기화는 않마
    // 삼각형은 세 점을 가지고있따. 포함관꼐 , 삼각형 클래스에서 점 클래스를 가지고이음

    Triangle(Point[] p){
        this.p = p;
    }

    void draw(){
        System.out.println("색깔 : " + color + "각점의 좌표 : " + p[0].getXY() + ", " + p[1].getXY() + ", " + p[2].getXY());
    }
}
