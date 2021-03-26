package chapter7;

class Tv{
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}
class CaptionTv extends Tv{
    boolean caption;
    void displayCatption(String text){
        if(caption){
            System.out.println(text);
            System.out.println("caption TV의 " + channel);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10; // CaptionTv클래스는 Tv클래스 상속받기때문에 Tv클래스의 멤버사용가능
        ctv.channelUp(); // Tv클래스의 메서드도 당연사용가능(멤버는 멤버변수와 메서드)

        System.out.println(ctv.channel);

        ctv.displayCatption("Hello, World");
        ctv.caption = true;
        ctv.displayCatption("Hello, world :)");
    }
}
