package chapter9.clone2;

class Point implements Cloneable{
    // Cloneable인터페이스 구현한 클래스에서만 clone()사용간으 -> 인스턴스의 데이터를 보호하기ㅜ이해서
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y : " + y;
    }

    // 공변타입 - 오버라이딩하는데 선언부가 달라짐. 리턴타입이 달라짐.
    public Point clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException ce){

        }
        return (Point)obj;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        Point copy = p.clone();
        System.out.println(p);
        System.out.println(copy);
    }
}
