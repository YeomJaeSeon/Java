package chapter7;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D4 p1 = new Point3D4(1, 2, 3);
        System.out.println(p1.x + "," + p1.y + "," + p1.z);
    }
}
class Point4{
    int x = 10;
    int y = 20;

    Point4(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Point3D4 extends Point4{
    int z = 30;

    Point3D4(){
        this(100, 200, 300);
    }
    Point3D4(int x, int y, int z){
        super(x, y); // 부모클래스 Point로부터 상속받은 멤버는 이렇게 부모클래스의 생성자로 초기화해줘야한다.
        this.z = z;
    }
}
