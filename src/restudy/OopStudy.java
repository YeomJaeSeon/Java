package restudy;

class Tv{
    int channel;
    boolean power;
    String color;

    void onOff(){
        power = !power;
    }
    void channelDown(){
        --channel;
    }
    void channelUp(){
        ++channel;
    }
}

public class OopStudy {
    public static void main(String[] args) {
        Tv tv1 = new Tv(); // 참조변수를 통해서 인스턴스 접근가능.
        Tv tv2 = new Tv(); //
        // 두 참조변수는 각각 다른인스턴스를 가르키고있음(다른 인스턴스의 주소를 가지고있음)
        tv1.channel = 10;
        tv2.channel = 15;
        System.out.println("tv1 channel : " + tv1.channel);
        System.out.println("tv2 channel : " + tv2.channel);
        // 같은 클래스로부터 생성된 이늣턴스여도 가각ㄱ의 인스턴스는 다 다른 멤버변수를 유지하굉ㅆ다.
        //추가로 메서드의 내용은 모드 ㄴ인스턴스에 대해 동일하다.

        tv1.channelDown();
        tv1.channelDown();
        System.out.println("tv1 channel : " + tv1.channel);
        System.out.println("tv2 channel : " + tv2.channel);

        tv2.channelUp();
        tv2.channelUp();
        System.out.println("tv1 channel : " + tv1.channel);
        System.out.println("tv2 channel : " + tv2.channel);
        // 인스턴스들이 같은 클래스로부터 만들어졌다 하더라고 각각의 멤버변수느 ㄴ다르 ㄴ값을 유지하굉ㅆ음.

    }
}
