package chapter9.clone;

class Circle implements Cloneable{
    Point3 p;
    double r;

    Circle(Point3 p, double r){
        this.p = p;
        this.r = r;
    }
    public Circle clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){}
        return (Circle) obj;
    }
}

class Point3{
    int x, y;
    Point3(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y : " + y;
    }
}

public class ShalloCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point3(1, 1), 5.0);
        Circle c2 = c1.clone();

        c2.p.x = 2; // c2의 인스턴스읜 p만 변경햇는데 c1의 인스턴스도 변경됨 - shallow copy다. 이게
        // 인스턴스가 참조변수면 값만 복사하지 주소자체를 복하자ㅣㄴ못함. 그럼어케할까?

        System.out.println(c1.p);
        System.out.println(c2.p);
    }
}
