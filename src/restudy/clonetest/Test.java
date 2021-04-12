package restudy.clonetest;


// Object클래스의 clone()메서드 실험
class Point{
    int x, y;
    Point(int x, int  y){
        this.x = x;
        this.y =y;
    }

    @Override
    public String toString() {
        return "x : " + x + ", y : " + y;
    }
}

class Circle implements Cloneable{
    Point p;
    double r;

    Circle(Point p, double r){
        this.p = p;
        this.r = r;
    }

    public Circle clone(){
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
public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(new Point(1, 2), 3.0);
        Circle copy = c.clone();
        c.p.x = 10; // shallow copy를 하였기에.. 그냥 Circle의 멤버변수중 참조변수인 Point도
        // shallow copy를 하였기 때문에 p가 가지고있는 주소만 복사하게되었따. 그래서 ㅇ원본 멤버변수(참조변수) 변경하면
        // 복사본도 영향을 바음
        // deep copy를 추가해보자. 오버라이딩으로
        System.out.println(c.p);
        System.out.println(copy.p);

        Circle c2 = new Circle(new Point(5, 2), 4.0);
        Circle deepCopy = c.deepClone();
        c2.p.x = 50;
        System.out.println(c2.p);
        System.out.println(deepCopy.p);
    }
}
