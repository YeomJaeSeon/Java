package chapter12.t1;

class Tv{
    boolean power;
    int channel;
    int sound;

    void powerOff(){
        power = false;
    }
    void powerOn(){
        power = true;
    }
}
class SmartTv extends Tv{
    void speaking(){
        System.out.println("TV가 말해요");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Tv tv = new SmartTv();

        Tv tv2 = new Tv();
        SmartTv smartTv = new SmartTv();

        ((SmartTv)tv).speaking();

//        SmartTv st =(SmartTv) tv2;

    }
}
