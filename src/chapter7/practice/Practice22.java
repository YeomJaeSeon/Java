package chapter7.practice;

import org.w3c.dom.css.Rect;

abstract class Shape {
    private Point p;
    Shape() {
        this(new Point(0,0));
    }
    Shape(Point p) {
        this.p = p;
    }
    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

    Point getPosition() {
        return p;
    }
    void setPosition(Point p) {
        this.p = p;
    }
}
class Point {
    int x;
    int y;
    Point() {
        this(0,0);
    }
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "["+x+","+y+"]";
    }
}

class Circle extends Shape{
    double r;
    Circle(){
        this(10.0);
    }
    Circle(double r){
        super(new Point(0, 0));
        this.r = r;
    }

    double calcArea(){
        return r * r * Math.PI;
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(){
        this(100, 200);
    }

    Rectangle(double width, double height){
        super(new Point(0, 0));
        this.width = width;
        this.height = height;
    }

    double calcArea(){
        return width * height;
    }

    boolean isSquare(){
        return width == height;
    }
}
public class Practice22 {
    static double sumArea(Shape[] arr){
        double sum = 0.0;
        for (Shape shape : arr) {
            sum += shape.calcArea();
        }
        return sum;
    }
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println(" :"+sumArea(arr));
    }
}

//7-24
/*
e : 패키지간의연결 X
 */

