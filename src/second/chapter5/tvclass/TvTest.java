package second.chapter5.tvclass;

// 클래스는 객체를 생성하기위한 틀 , 속성과 기능을 가지고있음

class Tv{
    public static String hello = "안녕";
    private int channel;
    private boolean power;
    private String color;
    // 속성

    public Tv(String color){
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

        public void setChannel(int channel) {
            this.channel = channel;
        }

        public void setPower(boolean power) {
            this.power = power;
        }

        public String getColor() {
            return color;
        }

        public int getChannel() {
        return channel;
    }

    public boolean getPower() {
        return power;
    }

    @Override
    public String toString() {
        return channel + " : " + color + " : " + power;
    }

    //기능들.
}

public class TvTest {
    public static void main(String[] args) {
        Tv t1 = new Tv("white"); // 참조변수를 통해서 인스턴스에 접근가능.
        //인스턴스 생성 : 참조변수 = 인스턴스
        Tv t2 = new Tv("Red"); // gc에의해서 정리됨.
        t2 = t1;
        t1.setPower(true);

        System.out.println(t1);
        System.out.println(t2);

        Tv[] tvArr = new Tv[10];
        for(int i = 0; i < 10; i++){
            tvArr[i] = new Tv("black");
        }

        tvArr[2].setPower(true);

        for (Tv tv : tvArr) {
            System.out.println(tv);
        }

    }
}


