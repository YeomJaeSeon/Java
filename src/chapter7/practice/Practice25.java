package chapter7.practice;

class Outer{
    class Innter{
        int iv = 100;
    }
}

public class Practice25 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.new Innter().iv);
    }
}
