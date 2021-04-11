package chapter9.clone;

// CLone)을 호출하려면 Cloneable인터페이스 구현해야한다. 이 인터페이스 구현한 클래스에서만 clone()을호출ㅇ할수있따.
class Point implements Cloneable{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x : " + x + ", y : " + y;
    }

    @Override
    protected Object clone(){
        Object obj = null;
        try{
            obj = super.clone(); // clone은 예외처리해야함 throws로 던지던가.

        }catch (CloneNotSupportedException e){}

        return obj;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Point original = new Point(5, 3);
        Point copy = (Point) original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}
