package second.chapter6.poly;

class Tv{
    boolean power;
    int channel = 100;

    void power(){
        power = !power;
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
}

class CaptionTv extends Tv{
    String text;

    void caption(){
        System.out.println(text);
    }
}

public class Test {

    public static void main(String[] args) {
        Tv tv = new CaptionTv();
        CaptionTv captionTv = new CaptionTv();




    }
}
