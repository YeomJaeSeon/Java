package chapter6;

class SamsungTv{
    static String brandName = "삼성";
    
    String color;
    int width;
    int height;
    int channel;
    boolean power;
    
    void powerOnOff(){
        power = !power; //인스턴스 변수를 사용하므로 인스턴스 메서드로정의해야함
    }
    
    static void customerChoice(String name){
        System.out.println("고객의 선택은 : " + name);
        System.out.println(new SamsungTv().width); // 객체를 생성해야만 클래스 메서드(static메서드에서)인스턴스 변수에 접근가능함.

    }
    
    void channelDown(){
        --channel;
    }
    void channelUp(){
        ++channel;
    }
    
    
}

public class StaticTvEx {
    public static void main(String[] args) {
        System.out.println(SamsungTv.brandName);
        SamsungTv.customerChoice("삼성 아몰레드 320");
        // 클래스 메서드나 클래스변수는 인스턴스 생성안해도 이렇게 사용가능
        
        SamsungTv tv1 = new SamsungTv();
        
        tv1.channel = 10;
        tv1.channelDown(); // 인스턴스메서드
        System.out.println(tv1.channel); // 인스턴스 변수
        //이녀석들은 인스턴스 새엇ㅇ된다음에 사용가능
    }
}
