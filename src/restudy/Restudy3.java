package restudy;

class Ttv{
    String color;
    boolean power;
    int channel;
    static int width = 150;
    static int height = 100;

    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}

public class Restudy3 {
    public static void main(String[] args) {
        Ttv[] tvs = new Ttv[5];
        System.out.println(tvs[0]);

        for(int i = 0; i < tvs.length; i++){
            tvs[i] = new Ttv();
            tvs[i].channel = i + 10;
            System.out.println(tvs[i]);
        }

        for(Ttv value : tvs){
            value.channelUp();
            System.out.println(value.channel);
        }

        // 클래스변수는 이렇게 참조변수롲 ㅓㅂ근하기보단 클래스일므으로 접근해서 인스턴스변수와의 차이를 준다(차별성)
        System.out.println(Ttv.height + ", " + Ttv.width);


    }
}
