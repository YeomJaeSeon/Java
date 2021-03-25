package chapter6.practice;

//6,7
class MyPoint{
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    double getDistance(int x1, int y1){
        int diffX = (x1 - x) * (x1 - x);
        int diffy = (y1 - y) * (y1 - y);

        return Math.sqrt((double)(diffX + diffy));
    }
}

public class Number6 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 1);

        System.out.println(p1.getDistance( 2, 2 ));
    }
}
