package chapter6;

class Data{
    int x;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change (d.x)");
        System.out.println("main() : x = " + d.x);
        //10
        //1000
        //10
    }
    static void change(int x){
        x = 1000;
        System.out.println("change() : x = " + x);
        return;
    }

    //자명 그런데 객체, 즉 reference주소를넘기면?
}
