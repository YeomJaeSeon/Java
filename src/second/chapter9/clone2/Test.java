package second.chapter9.clone2;

class Point{
    int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Circle implements Cloneable{
    Point p;
    double r;

    public Circle(Point p, double r){
        this.p = p;
        this.r = r;
    }

    //공변 반환타입 - override 반환타입을 다르게해도됨 (좁은 범위로 OK)
    public Circle shallowClone(){
        Object obj= null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){}
        Circle circle = (Circle) obj;
        return circle;
    }

    public Circle deepClone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e) {}
        Circle circle = (Circle) obj;
        circle.p = new Point(this.p.x, this.p.y);
        return circle;
    }

    @Override
    public String toString() {
        return "[" + this.p.x + ", " + this.p.y + "]" + " r : " + r;
    }
}

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1, 2), 2.0);
        Circle shallowCopyCircle = circle.shallowClone();

        shallowCopyCircle.p.x = 200;

        System.out.println("원본 : " + circle);
        System.out.println("복제본 : " + shallowCopyCircle);
        // shallow copy하여서, 내부 멤버중 Point의 주소는 갖음
        System.out.println(circle.p); // Object의 toSTring메서드로 확인
        System.out.println(shallowCopyCircle.p);
        System.out.println("is same? : " + (circle.p == shallowCopyCircle.p));

        Circle deepCopyCircle = circle.deepClone();

        deepCopyCircle.p.x = 300;

        System.out.println("원본 : " + circle);
        System.out.println("복제본 : " + deepCopyCircle);

        System.out.println(circle.p);
        System.out.println(deepCopyCircle.p);
        System.out.println("is same? : " +(circle.p == deepCopyCircle.p));



    }
}
