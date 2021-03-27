package chapter7;

class Tv2{
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

class CaptionTv2 extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption)
            System.out.println(text);
    }
}

public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 tv = new CaptionTv2();
        // 자식클래스인 CaptionTv2의 인스턴스를 생성하면 부모클래스의 멤버도 함께 생성되기 때문에
        // 따로 조상클래스의 인스턴스를 생성ㅇ하지 않고도 조상클래스의 멤버들을 사용할수있다.
        tv.channel = 10;
        tv.channelDown();

        tv.power = true;
        tv.power();

        System.out.println("tv 채널 : " + tv.channel + ", tv power상태 : " + tv.power); // 부모로부터 상속받은 멤버 (Tv클래스로부터 상소갑ㄷ은 멤버사용가능)
        tv.caption = true;
        tv.displayCaption("안녕안녕 나는 수지야");
    }
}
