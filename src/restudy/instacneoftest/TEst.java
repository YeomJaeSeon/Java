package restudy.instacneoftest;

class Car{
    int door;
    String color;

    void stop(){
        System.out.println("stop!!");
    }
    void dribe(){
        System.out.println("drive!!");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("water~~");
    }

}
class MiniFireengine extends FireEngine{
    void smallWater(){
        System.out.println("small water~~");
    }
}
public class TEst {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        System.out.println(fe instanceof FireEngine);
        System.out.println(fe instanceof Car);
        System.out.println(fe instanceof Object);
        System.out.println(fe instanceof MiniFireengine);

        // instacneof는 참조변수 형변환전에확인하는 연산자.. 같은타입이거나 조상이면 true
    }
}
