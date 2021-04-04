package chapter7.multi;


class Tv{
    private int channel;
    
    int getChannel(){
        return channel;
    }
    void setChannel(int channel){
        this.channel = channel;
    }
    
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
}
class SmartTv extends Tv{
    void caption(String s){
        System.out.println(s+"를 추력");
    }
}

class MoreSmartTv extends Tv{
    void realCaption(String s){
        System.out.println("3D로 " + s + "를 출력");
    }
}

public class Test {
    public static void main(String[] args) {
        Tv t = new SmartTv();
        SmartTv sm = (SmartTv) t;
        sm.caption("ㅋㅋ");

        Tv t2 = new MoreSmartTv();
        MoreSmartTv moreSmartTv = (MoreSmartTv) t2;
        moreSmartTv.realCaption("쿠쿠");
        // 다형성은 부모타입의 참조변수로 자식타입의인스턴스 접근
        // 2. 참조변수 형변환 - 멤버갯수조절 (상속관계 형변환가능)
        // 3. instacndof - 참조변수형변환 확인 연산자 ㅊ마조변수 instnceof 클래스(타입)

    }
}
