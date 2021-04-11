package chapter9.clone2;
// shallow vs deep
class Circle implements Cloneable{
    Point p;
    double r;

    Circle(Point p, double r){
        this.p = p;
        this.r = r;
    }

    public Circle shallowClone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException ce){}
        return (Circle) obj;
    }
    public Circle deepClone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException ce){}
        Circle circle = (Circle) obj;
        circle.p = new Point(p.x, p.y);

        return circle;
    }
}
public class Ex3 {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1, 1), 2.0);
        Circle c2 = c1.shallowClone();
        Circle c3 = c1.deepClone(); // deep Copy는 영향 X

        c1.p.x = 5;
        System.out.println(c1.p);
        System.out.println(c2.p);
        System.out.println(c3.p);
    }
}
