package chapter7;

class Point3{
    int x, y;
    Point3(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point3(){
        this(10, 10);
    }
    String getLocation(){
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point3{
    int z;

    Point3D(int z){
        //super(); 이게 컴파일러가 자동으로만든다. this()나 super()이없으면 컴파일러가 자동으로 super()를만듬
        this.z = z;
        // 생서앚에서 super로 부모클래스의 생성자를 먼저 호출하는 이유는 자식 클래스의 멤버에서
        // 부모클래스의 멤버를 사용할수있기때문에
        // 역은안됨? -> 부모클래스는 자식클래스 멤버없잖아.. 상속관계 다시생각하기바람.
    }
    String getLocation(){
        return "x : " + x + ",y : " + y + ", z : " + z;
    }
}


public class PointTest {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(3);
        System.out.println(p1.getLocation());
    }
}
