package second.chapter9.clone1;

import chapter5.Array;

import java.util.Arrays;

class Point {
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Circle implements Cloneable{
    Point p;
    double r;

    Circle(Point p, double r){
        this.p = p;
        this.r = r;
    }
    public Circle shallowCopy(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e) {}
        return (Circle) obj;
    }

    public Circle deepCopy(){
        Object obj = null;
        try{
            obj =super.clone();
        }catch (CloneNotSupportedException e) {}
        Circle circle = (Circle) obj;
        circle.p = new Point(this.p.x, this.p.y);

        return circle;
    }

    @Override
    public String toString() {
        return String.format("x : %d, y : %d, r : %f\n", p.x, p.y, r);
    }
}

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1, 2), 10);
        Circle circle1 = circle.shallowCopy();
        Circle circle2 = circle.deepCopy();

        circle1.p.x=200;

        System.out.println(circle1);
        System.out.println(circle);
        System.out.println(circle2);

    }
}
