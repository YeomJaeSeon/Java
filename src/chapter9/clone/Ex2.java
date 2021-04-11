package chapter9.clone;

class Point2 implements Cloneable{
    int x, y;
    Point2(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x : " + x + ", " + y;
    }
    public Point clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){}
        return (Point) obj;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Point2 original = new Point2(1, 2);
        Point copy = original.clone();
        System.out.println(copy);
        System.out.println(original);
    }
}
