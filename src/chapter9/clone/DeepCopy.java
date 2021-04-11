package chapter9.clone;

class Circle5 implements Cloneable{
    Point5 p;
    double r;

    Circle5(Point5 p, double r){
        this.p = p;
        this.r = r;
    }
    public Circle5 clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){}
        Circle5 c = (Circle5) obj;
        c.p = new Point5(p.x, p.y); // 아애 다른 객체를 받아버림
        return c;
    }
}

class Point5{
    int x, y;
    Point5(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y : " + y;
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        Circle5 c1 = new Circle5(new Point5(1, 1), 5.0);
        Circle5 c2 = c1.clone();

        c2.p.x = 2; // deep copy가됨.

        System.out.println(c1.p);
        System.out.println(c2.p);
    }
}
